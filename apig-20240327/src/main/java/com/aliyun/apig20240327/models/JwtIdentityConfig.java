// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class JwtIdentityConfig extends TeaModel {
    @NameInMap("jwks")
    public String jwks;

    @NameInMap("jwtPayloadConfig")
    public JwtIdentityConfigJwtPayloadConfig jwtPayloadConfig;

    @NameInMap("jwtTokenConfig")
    public JwtIdentityConfigJwtTokenConfig jwtTokenConfig;

    @NameInMap("secretType")
    public String secretType;

    @NameInMap("type")
    public String type;

    public static JwtIdentityConfig build(java.util.Map<String, ?> map) throws Exception {
        JwtIdentityConfig self = new JwtIdentityConfig();
        return TeaModel.build(map, self);
    }

    public JwtIdentityConfig setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public JwtIdentityConfig setJwtPayloadConfig(JwtIdentityConfigJwtPayloadConfig jwtPayloadConfig) {
        this.jwtPayloadConfig = jwtPayloadConfig;
        return this;
    }
    public JwtIdentityConfigJwtPayloadConfig getJwtPayloadConfig() {
        return this.jwtPayloadConfig;
    }

    public JwtIdentityConfig setJwtTokenConfig(JwtIdentityConfigJwtTokenConfig jwtTokenConfig) {
        this.jwtTokenConfig = jwtTokenConfig;
        return this;
    }
    public JwtIdentityConfigJwtTokenConfig getJwtTokenConfig() {
        return this.jwtTokenConfig;
    }

    public JwtIdentityConfig setSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }
    public String getSecretType() {
        return this.secretType;
    }

    public JwtIdentityConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class JwtIdentityConfigJwtPayloadConfig extends TeaModel {
        @NameInMap("payloadKeyName")
        public String payloadKeyName;

        @NameInMap("payloadKeyValue")
        public String payloadKeyValue;

        public static JwtIdentityConfigJwtPayloadConfig build(java.util.Map<String, ?> map) throws Exception {
            JwtIdentityConfigJwtPayloadConfig self = new JwtIdentityConfigJwtPayloadConfig();
            return TeaModel.build(map, self);
        }

        public JwtIdentityConfigJwtPayloadConfig setPayloadKeyName(String payloadKeyName) {
            this.payloadKeyName = payloadKeyName;
            return this;
        }
        public String getPayloadKeyName() {
            return this.payloadKeyName;
        }

        public JwtIdentityConfigJwtPayloadConfig setPayloadKeyValue(String payloadKeyValue) {
            this.payloadKeyValue = payloadKeyValue;
            return this;
        }
        public String getPayloadKeyValue() {
            return this.payloadKeyValue;
        }

    }

    public static class JwtIdentityConfigJwtTokenConfig extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("pass")
        public Boolean pass;

        @NameInMap("position")
        public String position;

        @NameInMap("prefix")
        public String prefix;

        public static JwtIdentityConfigJwtTokenConfig build(java.util.Map<String, ?> map) throws Exception {
            JwtIdentityConfigJwtTokenConfig self = new JwtIdentityConfigJwtTokenConfig();
            return TeaModel.build(map, self);
        }

        public JwtIdentityConfigJwtTokenConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public JwtIdentityConfigJwtTokenConfig setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public JwtIdentityConfigJwtTokenConfig setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public JwtIdentityConfigJwtTokenConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

}
