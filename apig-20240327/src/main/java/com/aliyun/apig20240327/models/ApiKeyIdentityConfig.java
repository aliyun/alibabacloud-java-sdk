// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ApiKeyIdentityConfig extends TeaModel {
    /**
     * <p>The API key source configuration.</p>
     */
    @NameInMap("apikeySource")
    public ApiKeyIdentityConfigApikeySource apikeySource;

    /**
     * <p>The complete set of API key credential sources. The set contains one to three items. Multiple sources are applicable only to AI gateway Header mode. Query String and non-AI gateway allow only a single source. When submitted together with apikeySource, the latter must be consistent with the compatible projection.</p>
     */
    @NameInMap("apikeySources")
    public java.util.List<ApiKeyIdentityConfigApikeySources> apikeySources;

    /**
     * <p>The list of credentials.</p>
     */
    @NameInMap("credentials")
    public java.util.List<ApiKeyIdentityConfigCredentials> credentials;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>Apikey</p>
     */
    @NameInMap("type")
    public String type;

    public static ApiKeyIdentityConfig build(java.util.Map<String, ?> map) throws Exception {
        ApiKeyIdentityConfig self = new ApiKeyIdentityConfig();
        return TeaModel.build(map, self);
    }

    public ApiKeyIdentityConfig setApikeySource(ApiKeyIdentityConfigApikeySource apikeySource) {
        this.apikeySource = apikeySource;
        return this;
    }
    public ApiKeyIdentityConfigApikeySource getApikeySource() {
        return this.apikeySource;
    }

    public ApiKeyIdentityConfig setApikeySources(java.util.List<ApiKeyIdentityConfigApikeySources> apikeySources) {
        this.apikeySources = apikeySources;
        return this;
    }
    public java.util.List<ApiKeyIdentityConfigApikeySources> getApikeySources() {
        return this.apikeySources;
    }

    public ApiKeyIdentityConfig setCredentials(java.util.List<ApiKeyIdentityConfigCredentials> credentials) {
        this.credentials = credentials;
        return this;
    }
    public java.util.List<ApiKeyIdentityConfigCredentials> getCredentials() {
        return this.credentials;
    }

    public ApiKeyIdentityConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ApiKeyIdentityConfigApikeySource extends TeaModel {
        /**
         * <p>The API key source.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The API key value.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("value")
        public String value;

        public static ApiKeyIdentityConfigApikeySource build(java.util.Map<String, ?> map) throws Exception {
            ApiKeyIdentityConfigApikeySource self = new ApiKeyIdentityConfigApikeySource();
            return TeaModel.build(map, self);
        }

        public ApiKeyIdentityConfigApikeySource setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ApiKeyIdentityConfigApikeySource setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ApiKeyIdentityConfigApikeySources extends TeaModel {
        /**
         * <p>The credential source type.</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The field name of the HTTP header or query string.</p>
         */
        @NameInMap("value")
        public String value;

        public static ApiKeyIdentityConfigApikeySources build(java.util.Map<String, ?> map) throws Exception {
            ApiKeyIdentityConfigApikeySources self = new ApiKeyIdentityConfigApikeySources();
            return TeaModel.build(map, self);
        }

        public ApiKeyIdentityConfigApikeySources setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ApiKeyIdentityConfigApikeySources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ApiKeyIdentityConfigCredentials extends TeaModel {
        /**
         * <p>The API key configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("apikey")
        public String apikey;

        /**
         * <p>The generation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("generateMode")
        public String generateMode;

        public static ApiKeyIdentityConfigCredentials build(java.util.Map<String, ?> map) throws Exception {
            ApiKeyIdentityConfigCredentials self = new ApiKeyIdentityConfigCredentials();
            return TeaModel.build(map, self);
        }

        public ApiKeyIdentityConfigCredentials setApikey(String apikey) {
            this.apikey = apikey;
            return this;
        }
        public String getApikey() {
            return this.apikey;
        }

        public ApiKeyIdentityConfigCredentials setGenerateMode(String generateMode) {
            this.generateMode = generateMode;
            return this;
        }
        public String getGenerateMode() {
            return this.generateMode;
        }

    }

}
