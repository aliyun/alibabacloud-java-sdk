// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectApiKeysResponseBody extends TeaModel {
    /**
     * <p>The queried API keys.</p>
     */
    @NameInMap("ApiKeys")
    public java.util.List<GetSupabaseProjectApiKeysResponseBodyApiKeys> apiKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSupabaseProjectApiKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectApiKeysResponseBody self = new GetSupabaseProjectApiKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectApiKeysResponseBody setApiKeys(java.util.List<GetSupabaseProjectApiKeysResponseBodyApiKeys> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<GetSupabaseProjectApiKeysResponseBodyApiKeys> getApiKeys() {
        return this.apiKeys;
    }

    public GetSupabaseProjectApiKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSupabaseProjectApiKeysResponseBodyApiKeys extends TeaModel {
        /**
         * <p>The queried API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Tmz2Z59caMDeq/Xi9vuc****</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The name of the API key, including the Anon key and the service role key.</p>
         * 
         * <strong>example:</strong>
         * <p>anon key</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetSupabaseProjectApiKeysResponseBodyApiKeys build(java.util.Map<String, ?> map) throws Exception {
            GetSupabaseProjectApiKeysResponseBodyApiKeys self = new GetSupabaseProjectApiKeysResponseBodyApiKeys();
            return TeaModel.build(map, self);
        }

        public GetSupabaseProjectApiKeysResponseBodyApiKeys setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetSupabaseProjectApiKeysResponseBodyApiKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
