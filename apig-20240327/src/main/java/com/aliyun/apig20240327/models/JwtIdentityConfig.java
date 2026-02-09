// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class JwtIdentityConfig extends TeaModel {
    /**
     * <p>The JWKS configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("jwks")
    public String jwks;

    /**
     * <p>The JWT payload configuration.</p>
     */
    @NameInMap("jwtPayloadConfig")
    public JwtIdentityConfigJwtPayloadConfig jwtPayloadConfig;

    /**
     * <p>The JWT token configuration.</p>
     */
    @NameInMap("jwtTokenConfig")
    public JwtIdentityConfigJwtTokenConfig jwtTokenConfig;

    /**
     * <p>The type of the secret used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Asymmetry: asymmetric encryption.</li>
     * <li>Symmetry: symmetric encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Symmetry</p>
     */
    @NameInMap("secretType")
    public String secretType;

    /**
     * <p>The authentication configuration type.</p>
     * 
     * <strong>example:</strong>
     * <p>Jwt</p>
     */
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
        /**
         * <p>The key in the JWT payload.</p>
         * 
         * <strong>example:</strong>
         * <p>uid</p>
         */
        @NameInMap("payloadKeyName")
        public String payloadKeyName;

        /**
         * <p>The value for the JWT payload key.</p>
         * 
         * <strong>example:</strong>
         * <p>2222</p>
         */
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
        /**
         * <p>The key used for the JWT.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>Indicates whether acceptance is granted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("pass")
        public Boolean pass;

        /**
         * <p>The location where the JWT is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <p>The token prefix configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
