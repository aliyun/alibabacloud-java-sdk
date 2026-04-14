// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CacheCluster extends TeaModel {
    @NameInMap("bindedWorkspaces")
    public java.util.List<String> bindedWorkspaces;

    @NameInMap("cachesets")
    public java.util.List<CacheClusterCachesets> cachesets;

    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("configuration")
    public String configuration;

    @NameInMap("configurations")
    public java.util.List<CacheClusterConfigurations> configurations;

    @NameInMap("creator")
    public String creator;

    @NameInMap("gmtCreated")
    public Long gmtCreated;

    @NameInMap("gmtModified")
    public Long gmtModified;

    @NameInMap("modifier")
    public String modifier;

    @NameInMap("name")
    public String name;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceSpec")
    public CacheClusterResourceSpec resourceSpec;

    @NameInMap("state")
    public String state;

    @NameInMap("usedResourceSpec")
    public CacheClusterUsedResourceSpec usedResourceSpec;

    public static CacheCluster build(java.util.Map<String, ?> map) throws Exception {
        CacheCluster self = new CacheCluster();
        return TeaModel.build(map, self);
    }

    public CacheCluster setBindedWorkspaces(java.util.List<String> bindedWorkspaces) {
        this.bindedWorkspaces = bindedWorkspaces;
        return this;
    }
    public java.util.List<String> getBindedWorkspaces() {
        return this.bindedWorkspaces;
    }

    public CacheCluster setCachesets(java.util.List<CacheClusterCachesets> cachesets) {
        this.cachesets = cachesets;
        return this;
    }
    public java.util.List<CacheClusterCachesets> getCachesets() {
        return this.cachesets;
    }

    public CacheCluster setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CacheCluster setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CacheCluster setConfigurations(java.util.List<CacheClusterConfigurations> configurations) {
        this.configurations = configurations;
        return this;
    }
    public java.util.List<CacheClusterConfigurations> getConfigurations() {
        return this.configurations;
    }

    public CacheCluster setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CacheCluster setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public CacheCluster setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CacheCluster setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public CacheCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CacheCluster setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CacheCluster setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CacheCluster setResourceSpec(CacheClusterResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public CacheClusterResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public CacheCluster setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CacheCluster setUsedResourceSpec(CacheClusterUsedResourceSpec usedResourceSpec) {
        this.usedResourceSpec = usedResourceSpec;
        return this;
    }
    public CacheClusterUsedResourceSpec getUsedResourceSpec() {
        return this.usedResourceSpec;
    }

    public static class CacheClusterCachesets extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("path")
        public String path;

        public static CacheClusterCachesets build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterCachesets self = new CacheClusterCachesets();
            return TeaModel.build(map, self);
        }

        public CacheClusterCachesets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CacheClusterCachesets setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CacheClusterConfigurations extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>cacheset.xml</p>
         */
        @NameInMap("name")
        public String name;

        public static CacheClusterConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterConfigurations self = new CacheClusterConfigurations();
            return TeaModel.build(map, self);
        }

        public CacheClusterConfigurations setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CacheClusterConfigurations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CacheClusterResourceSpec extends TeaModel {
        @NameInMap("bandWidth")
        public Long bandWidth;

        @NameInMap("storage")
        public Long storage;

        public static CacheClusterResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterResourceSpec self = new CacheClusterResourceSpec();
            return TeaModel.build(map, self);
        }

        public CacheClusterResourceSpec setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public CacheClusterResourceSpec setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

    }

    public static class CacheClusterUsedResourceSpec extends TeaModel {
        @NameInMap("bandWidth")
        public Long bandWidth;

        @NameInMap("storage")
        public Long storage;

        public static CacheClusterUsedResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterUsedResourceSpec self = new CacheClusterUsedResourceSpec();
            return TeaModel.build(map, self);
        }

        public CacheClusterUsedResourceSpec setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public CacheClusterUsedResourceSpec setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

    }

}
