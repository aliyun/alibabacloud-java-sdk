// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CredentialPublicConfig extends TeaModel {
    @NameInMap("authConfig")
    public java.util.Map<String, String> authConfig;

    @NameInMap("authType")
    public String authType;

    @NameInMap("headerKey")
    public String headerKey;

    @NameInMap("provider")
    public String provider;

    @NameInMap("remoteConfig")
    public CredentialPublicConfigRemoteConfig remoteConfig;

    @NameInMap("users")
    public java.util.List<CredentialPublicConfigUsers> users;

    public static CredentialPublicConfig build(java.util.Map<String, ?> map) throws Exception {
        CredentialPublicConfig self = new CredentialPublicConfig();
        return TeaModel.build(map, self);
    }

    public CredentialPublicConfig setAuthConfig(java.util.Map<String, String> authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public java.util.Map<String, String> getAuthConfig() {
        return this.authConfig;
    }

    public CredentialPublicConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CredentialPublicConfig setHeaderKey(String headerKey) {
        this.headerKey = headerKey;
        return this;
    }
    public String getHeaderKey() {
        return this.headerKey;
    }

    public CredentialPublicConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CredentialPublicConfig setRemoteConfig(CredentialPublicConfigRemoteConfig remoteConfig) {
        this.remoteConfig = remoteConfig;
        return this;
    }
    public CredentialPublicConfigRemoteConfig getRemoteConfig() {
        return this.remoteConfig;
    }

    public CredentialPublicConfig setUsers(java.util.List<CredentialPublicConfigUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<CredentialPublicConfigUsers> getUsers() {
        return this.users;
    }

    public static class CredentialPublicConfigRemoteConfig extends TeaModel {
        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("ttl")
        public Integer ttl;

        @NameInMap("uri")
        public String uri;

        public static CredentialPublicConfigRemoteConfig build(java.util.Map<String, ?> map) throws Exception {
            CredentialPublicConfigRemoteConfig self = new CredentialPublicConfigRemoteConfig();
            return TeaModel.build(map, self);
        }

        public CredentialPublicConfigRemoteConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CredentialPublicConfigRemoteConfig setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public CredentialPublicConfigRemoteConfig setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CredentialPublicConfigUsers extends TeaModel {
        @NameInMap("password")
        public String password;

        @NameInMap("username")
        public String username;

        public static CredentialPublicConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            CredentialPublicConfigUsers self = new CredentialPublicConfigUsers();
            return TeaModel.build(map, self);
        }

        public CredentialPublicConfigUsers setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CredentialPublicConfigUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
