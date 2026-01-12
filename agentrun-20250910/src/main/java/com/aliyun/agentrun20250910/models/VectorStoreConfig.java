// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class VectorStoreConfig extends TeaModel {
    @NameInMap("config")
    public VectorStoreConfigConfig config;

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

}
