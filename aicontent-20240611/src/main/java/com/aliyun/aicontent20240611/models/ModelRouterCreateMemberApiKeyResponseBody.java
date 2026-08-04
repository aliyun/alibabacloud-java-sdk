// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberApiKeyResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;apiKeyId&quot;: 502, &quot;apiKey&quot;: &quot;sk-xxxxxxxxxxxxxxxx&quot; }</p>
     */
    @NameInMap("data")
    public ModelRouterCreateMemberApiKeyResponseBodyData data;

    /**
     * <p>The fault message code.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterCreateMemberApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberApiKeyResponseBody self = new ModelRouterCreateMemberApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberApiKeyResponseBody setData(ModelRouterCreateMemberApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterCreateMemberApiKeyResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterCreateMemberApiKeyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterCreateMemberApiKeyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterCreateMemberApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterCreateMemberApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterCreateMemberApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterCreateMemberApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The full API key in plaintext. This value is returned only once during creation. Store it securely.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The API key ID. You can use this ID to query the bound groups by API key.</p>
         * 
         * <strong>example:</strong>
         * <p>502</p>
         */
        @NameInMap("apiKeyId")
        public Long apiKeyId;

        public static ModelRouterCreateMemberApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterCreateMemberApiKeyResponseBodyData self = new ModelRouterCreateMemberApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterCreateMemberApiKeyResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ModelRouterCreateMemberApiKeyResponseBodyData setApiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public Long getApiKeyId() {
            return this.apiKeyId;
        }

    }

}
