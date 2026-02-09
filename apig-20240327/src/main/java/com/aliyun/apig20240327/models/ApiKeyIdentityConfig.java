// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ApiKeyIdentityConfig extends TeaModel {
    /**
     * <p>The source configuration of the API key.</p>
     */
    @NameInMap("apikeySource")
    public ApiKeyIdentityConfigApikeySource apikeySource;

    /**
     * <p>The list of certificates.</p>
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
         * <p>The source of the API key.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Header</li>
         * <li>QueryString</li>
         * <li>Default</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The value of the API key.</p>
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
         * <p>The production mode.</p>
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
