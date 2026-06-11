// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CacheCluster extends TeaModel {
    /**
     * <p>An array of workspace IDs that are bound to the cache cluster.</p>
     */
    @NameInMap("bindedWorkspaces")
    public java.util.List<String> bindedWorkspaces;

    @NameInMap("cacheClusterId")
    public String cacheClusterId;

    @NameInMap("cacheClusterName")
    public String cacheClusterName;

    @NameInMap("cachesets")
    public java.util.List<CacheClusterCachesets> cachesets;

    /**
     * <p>The unique identifier of the cache cluster.</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The configuration of the cache cluster.</p>
     */
    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>An array of configuration objects.</p>
     */
    @NameInMap("configurations")
    public java.util.List<CacheClusterConfigurations> configurations;

    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The user who created the cache cluster.</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The creation time of the cache cluster, provided as a UNIX timestamp.</p>
     */
    @NameInMap("gmtCreated")
    public Long gmtCreated;

    /**
     * <p>The last modification time of the cache cluster, provided as a UNIX timestamp.</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The user who last modified the cache cluster.</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>The name of the cache cluster.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The billing method for the cache cluster.</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the region where the cache cluster is located.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The resource specifications of the cache cluster.</p>
     */
    @NameInMap("resourceSpec")
    public CacheClusterResourceSpec resourceSpec;

    /**
     * <p>The current state of the cache cluster.</p>
     */
    @NameInMap("state")
    public String state;

    @NameInMap("tables")
    public java.util.List<CacheClusterTables> tables;

    @NameInMap("tags")
    public java.util.List<CacheClusterTags> tags;

    /**
     * <p>The resource specifications currently in use by the cache cluster.</p>
     */
    @NameInMap("usedResourceSpec")
    public CacheClusterUsedResourceSpec usedResourceSpec;

    @NameInMap("version")
    public String version;

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

    public CacheCluster setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }
    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    public CacheCluster setCacheClusterName(String cacheClusterName) {
        this.cacheClusterName = cacheClusterName;
        return this;
    }
    public String getCacheClusterName() {
        return this.cacheClusterName;
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

    public CacheCluster setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
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

    public CacheCluster setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public CacheCluster setTables(java.util.List<CacheClusterTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<CacheClusterTables> getTables() {
        return this.tables;
    }

    public CacheCluster setTags(java.util.List<CacheClusterTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CacheClusterTags> getTags() {
        return this.tags;
    }

    public CacheCluster setUsedResourceSpec(CacheClusterUsedResourceSpec usedResourceSpec) {
        this.usedResourceSpec = usedResourceSpec;
        return this;
    }
    public CacheClusterUsedResourceSpec getUsedResourceSpec() {
        return this.usedResourceSpec;
    }

    public CacheCluster setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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
        /**
         * <p>The content of the configuration file.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the configuration file.</p>
         * 
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
        /**
         * <p>The bandwidth of the cache cluster.</p>
         */
        @NameInMap("bandWidth")
        public Long bandWidth;

        @NameInMap("ha")
        public Boolean ha;

        /**
         * <p>The storage capacity of the cache cluster.</p>
         */
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

        public CacheClusterResourceSpec setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public CacheClusterResourceSpec setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

    }

    public static class CacheClusterTables extends TeaModel {
        @NameInMap("catalogId")
        public String catalogId;

        @NameInMap("catalogProvider")
        public String catalogProvider;

        @NameInMap("database")
        public String database;

        @NameInMap("table")
        public String table;

        @NameInMap("workspaceId")
        public String workspaceId;

        public static CacheClusterTables build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterTables self = new CacheClusterTables();
            return TeaModel.build(map, self);
        }

        public CacheClusterTables setCatalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public String getCatalogId() {
            return this.catalogId;
        }

        public CacheClusterTables setCatalogProvider(String catalogProvider) {
            this.catalogProvider = catalogProvider;
            return this;
        }
        public String getCatalogProvider() {
            return this.catalogProvider;
        }

        public CacheClusterTables setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CacheClusterTables setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public CacheClusterTables setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class CacheClusterTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CacheClusterTags build(java.util.Map<String, ?> map) throws Exception {
            CacheClusterTags self = new CacheClusterTags();
            return TeaModel.build(map, self);
        }

        public CacheClusterTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CacheClusterTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CacheClusterUsedResourceSpec extends TeaModel {
        /**
         * <p>The amount of bandwidth consumed by the cache cluster.</p>
         */
        @NameInMap("bandWidth")
        public Long bandWidth;

        /**
         * <p>The amount of storage capacity consumed by the cache cluster.</p>
         */
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
