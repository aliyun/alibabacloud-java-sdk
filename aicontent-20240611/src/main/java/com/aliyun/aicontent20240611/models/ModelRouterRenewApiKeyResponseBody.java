// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterRenewApiKeyResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterRenewApiKeyResponseBodyData data;

    /**
     * <p>The fault message encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterRenewApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterRenewApiKeyResponseBody self = new ModelRouterRenewApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterRenewApiKeyResponseBody setData(ModelRouterRenewApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterRenewApiKeyResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterRenewApiKeyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterRenewApiKeyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterRenewApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterRenewApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterRenewApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterRenewApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time in RFC 3339 format. A value of null indicates that the API key remains valid indefinitely.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-01-01T00:00:00+08:00</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <p>API Key ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The enabled or disabled status. The status remains unchanged after renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        public static ModelRouterRenewApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterRenewApiKeyResponseBodyData self = new ModelRouterRenewApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterRenewApiKeyResponseBodyData setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public ModelRouterRenewApiKeyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterRenewApiKeyResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
