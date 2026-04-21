// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketApiKeyConfig extends TeaModel {
    @NameInMap("credentials")
    public java.util.List<HiMarketApiKeyConfigCredentials> credentials;

    @NameInMap("key")
    public String key;

    @NameInMap("source")
    public String source;

    public static HiMarketApiKeyConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketApiKeyConfig self = new HiMarketApiKeyConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketApiKeyConfig setCredentials(java.util.List<HiMarketApiKeyConfigCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<HiMarketApiKeyConfigCredentials> getCredentials() {
        return this.credentials;
    }

    public HiMarketApiKeyConfig setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public HiMarketApiKeyConfig setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public static class HiMarketApiKeyConfigCredentials extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("mode")
        public String mode;

        public static HiMarketApiKeyConfigCredentials build(java.util.Map<String, ?> map) throws Exception {
            HiMarketApiKeyConfigCredentials self = new HiMarketApiKeyConfigCredentials();
            return TeaModel.build(map, self);
        }

        public HiMarketApiKeyConfigCredentials setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public HiMarketApiKeyConfigCredentials setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
