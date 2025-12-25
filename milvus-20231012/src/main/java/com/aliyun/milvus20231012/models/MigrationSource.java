// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class MigrationSource extends TeaModel {
    @NameInMap("authInfo")
    public MigrationSourceAuthInfo authInfo;

    @NameInMap("database")
    public String database;

    @NameInMap("endpoint")
    public MigrationSourceEndpoint endpoint;

    public static MigrationSource build(java.util.Map<String, ?> map) throws Exception {
        MigrationSource self = new MigrationSource();
        return TeaModel.build(map, self);
    }

    public MigrationSource setAuthInfo(MigrationSourceAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public MigrationSourceAuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public MigrationSource setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public MigrationSource setEndpoint(MigrationSourceEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public MigrationSourceEndpoint getEndpoint() {
        return this.endpoint;
    }

    public static class MigrationSourceAuthInfo extends TeaModel {
        @NameInMap("authType")
        public String authType;

        @NameInMap("password")
        public String password;

        @NameInMap("token")
        public String token;

        @NameInMap("username")
        public String username;

        public static MigrationSourceAuthInfo build(java.util.Map<String, ?> map) throws Exception {
            MigrationSourceAuthInfo self = new MigrationSourceAuthInfo();
            return TeaModel.build(map, self);
        }

        public MigrationSourceAuthInfo setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public MigrationSourceAuthInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public MigrationSourceAuthInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public MigrationSourceAuthInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class MigrationSourceEndpoint extends TeaModel {
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("port")
        public String port;

        public static MigrationSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            MigrationSourceEndpoint self = new MigrationSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public MigrationSourceEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public MigrationSourceEndpoint setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
