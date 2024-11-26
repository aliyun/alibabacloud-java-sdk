// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public CreateDomainResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, used for tracing the API call chain.</p>
     * 
     * <strong>example:</strong>
     * <p>0C2D1C68-0D93-5561-8EE6-FDB7BF067A30</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDomainResponseBody setData(CreateDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDomainResponseBodyData getData() {
        return this.data;
    }

    public CreateDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDomainResponseBodyData extends TeaModel {
        /**
         * <p>Domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cpu1aullhtgkidg7sa4g</p>
         */
        @NameInMap("domainId")
        public String domainId;

        public static CreateDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResponseBodyData self = new CreateDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDomainResponseBodyData setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

    }

}
