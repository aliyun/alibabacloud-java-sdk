// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateSubnetResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response content.</p>
     */
    @NameInMap("Content")
    public UpdateSubnetResponseBodyContent content;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D9D6E7B-365B-5200-BFA6-9B79E269058C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubnetResponseBody self = new UpdateSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateSubnetResponseBody setContent(UpdateSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSubnetResponseBodyContent extends TeaModel {
        /**
         * <p>The subnet instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-yuvn29bn</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        public static UpdateSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubnetResponseBodyContent self = new UpdateSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

}
