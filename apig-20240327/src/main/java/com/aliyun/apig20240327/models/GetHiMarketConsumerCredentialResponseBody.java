// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHiMarketConsumerCredentialResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetHiMarketConsumerCredentialResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHiMarketConsumerCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHiMarketConsumerCredentialResponseBody self = new GetHiMarketConsumerCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHiMarketConsumerCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHiMarketConsumerCredentialResponseBody setData(GetHiMarketConsumerCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHiMarketConsumerCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetHiMarketConsumerCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHiMarketConsumerCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHiMarketConsumerCredentialResponseBodyData extends TeaModel {
        /**
         * <p>The API key credential configuration of the consumer. This corresponds to the common data structure HiMarketApiKeyConfig and includes the key, source, and credentials list members. Each item in the credentials list contains an apiKey.</p>
         */
        @NameInMap("apiKeyConfig")
        public HiMarketApiKeyConfig apiKeyConfig;

        /**
         * <p>The HMAC credential configuration of the consumer. This corresponds to the common data structure HiMarketHmacConfig and includes the credentials list member. Each item in the credentials list contains an ak and an sk.</p>
         */
        @NameInMap("hmacConfig")
        public HiMarketHmacConfig hmacConfig;

        public static GetHiMarketConsumerCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHiMarketConsumerCredentialResponseBodyData self = new GetHiMarketConsumerCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHiMarketConsumerCredentialResponseBodyData setApiKeyConfig(HiMarketApiKeyConfig apiKeyConfig) {
            this.apiKeyConfig = apiKeyConfig;
            return this;
        }
        public HiMarketApiKeyConfig getApiKeyConfig() {
            return this.apiKeyConfig;
        }

        public GetHiMarketConsumerCredentialResponseBodyData setHmacConfig(HiMarketHmacConfig hmacConfig) {
            this.hmacConfig = hmacConfig;
            return this;
        }
        public HiMarketHmacConfig getHmacConfig() {
            return this.hmacConfig;
        }

    }

}
