// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdResponseBody extends TeaModel {
    /**
     * <p>The details about the failed permission verification.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

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
    public CreateVpdResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBAD15D6-3F47-5B36-8A92-57C2919D13D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdResponseBody self = new CreateVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpdResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVpdResponseBody setContent(CreateVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVpdResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVpdResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun subnet ID list</p>
         */
        @NameInMap("SubnetIds")
        public java.util.List<String> subnetIds;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-eoiy88ju</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static CreateVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdResponseBodyContent self = new CreateVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVpdResponseBodyContent setSubnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public java.util.List<String> getSubnetIds() {
            return this.subnetIds;
        }

        public CreateVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
