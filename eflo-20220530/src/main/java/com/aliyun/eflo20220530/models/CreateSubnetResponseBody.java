// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateSubnetResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public CreateSubnetResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetResponseBody self = new CreateSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateSubnetResponseBody setContent(CreateSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public CreateSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSubnetResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun subnet instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-yuvn29bn</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        public static CreateSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateSubnetResponseBodyContent self = new CreateSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

}
