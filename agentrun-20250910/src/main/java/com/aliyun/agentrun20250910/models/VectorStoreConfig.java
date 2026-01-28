// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class VectorStoreConfig extends TeaModel {
    @NameInMap("config")
    public VectorStoreConfigConfig config;

    @NameInMap("mysqlConfig")
    public VectorStoreConfigMysqlConfig mysqlConfig;

    @NameInMap("provider")
    public String provider;

    public static VectorStoreConfig build(java.util.Map<String, ?> map) throws Exception {
        VectorStoreConfig self = new VectorStoreConfig();
        return TeaModel.build(map, self);
    }

    public VectorStoreConfig setConfig(VectorStoreConfigConfig config) {
        this.config = config;
        return this;
    }
    public VectorStoreConfigConfig getConfig() {
        return this.config;
    }

    public VectorStoreConfig setMysqlConfig(VectorStoreConfigMysqlConfig mysqlConfig) {
        this.mysqlConfig = mysqlConfig;
        return this;
    }
    public VectorStoreConfigMysqlConfig getMysqlConfig() {
        return this.mysqlConfig;
    }

    public VectorStoreConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public static class VectorStoreConfigConfig extends TeaModel {
        @NameInMap("collectionName")
        public String collectionName;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("vectorDimension")
        public Integer vectorDimension;

        public static VectorStoreConfigConfig build(java.util.Map<String, ?> map) throws Exception {
            VectorStoreConfigConfig self = new VectorStoreConfigConfig();
            return TeaModel.build(map, self);
        }

        public VectorStoreConfigConfig setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public VectorStoreConfigConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public VectorStoreConfigConfig setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public VectorStoreConfigConfig setVectorDimension(Integer vectorDimension) {
            this.vectorDimension = vectorDimension;
            return this;
        }
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

    }

    public static class VectorStoreConfigMysqlConfig extends TeaModel {
        @NameInMap("collectionName")
        public String collectionName;

        @NameInMap("credentialName")
        public String credentialName;

        @NameInMap("dbName")
        public String dbName;

        @NameInMap("host")
        public String host;

        @NameInMap("port")
        public Integer port;

        @NameInMap("user")
        public String user;

        @NameInMap("vectorDimension")
        public Integer vectorDimension;

        public static VectorStoreConfigMysqlConfig build(java.util.Map<String, ?> map) throws Exception {
            VectorStoreConfigMysqlConfig self = new VectorStoreConfigMysqlConfig();
            return TeaModel.build(map, self);
        }

        public VectorStoreConfigMysqlConfig setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public VectorStoreConfigMysqlConfig setCredentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }
        public String getCredentialName() {
            return this.credentialName;
        }

        public VectorStoreConfigMysqlConfig setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public VectorStoreConfigMysqlConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public VectorStoreConfigMysqlConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public VectorStoreConfigMysqlConfig setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public VectorStoreConfigMysqlConfig setVectorDimension(Integer vectorDimension) {
            this.vectorDimension = vectorDimension;
            return this;
        }
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

    }

}
