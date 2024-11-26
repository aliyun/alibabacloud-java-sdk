// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ApiKeyIdentityConfig extends TeaModel {
    @NameInMap("apikey")
    public String apikey;

    @NameInMap("apikeySource")
    public ApiKeyIdentityConfigApikeySource apikeySource;

    @NameInMap("generateMode")
    public String generateMode;

    @NameInMap("type")
    public String type;

    public static ApiKeyIdentityConfig build(java.util.Map<String, ?> map) throws Exception {
        ApiKeyIdentityConfig self = new ApiKeyIdentityConfig();
        return TeaModel.build(map, self);
    }

    public ApiKeyIdentityConfig setApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }
    public String getApikey() {
        return this.apikey;
    }

    public ApiKeyIdentityConfig setApikeySource(ApiKeyIdentityConfigApikeySource apikeySource) {
        this.apikeySource = apikeySource;
        return this;
    }
    public ApiKeyIdentityConfigApikeySource getApikeySource() {
        return this.apikeySource;
    }

    public ApiKeyIdentityConfig setGenerateMode(String generateMode) {
        this.generateMode = generateMode;
        return this;
    }
    public String getGenerateMode() {
        return this.generateMode;
    }

    public ApiKeyIdentityConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ApiKeyIdentityConfigApikeySource extends TeaModel {
        @NameInMap("source")
        public String source;

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

}
