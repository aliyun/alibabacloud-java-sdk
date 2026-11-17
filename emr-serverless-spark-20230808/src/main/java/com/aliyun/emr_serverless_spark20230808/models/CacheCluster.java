// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CacheCluster extends TeaModel {
    /**
     * <p>The associated workspaces.</p>
     */
    @NameInMap("bindedWorkspaces")
    public java.util.List<String> bindedWorkspaces;

    /**
     * <p>The cache cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>spc-xxxxxxx</p>
     */
    @NameInMap("cacheClusterId")
    public String cacheClusterId;

    /**
     * <p>The cache cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cache-cluster</p>
     */
    @NameInMap("cacheClusterName")
    public String cacheClusterName;

    /**
     * <p>The list of cache sets associated with the cache cluster.</p>
     */
    @NameInMap("cachesets")
    public java.util.List<CacheClusterCachesets> cachesets;

    /**
     * <p>The cache cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>spc-xxxxxxx</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;cache1&quot;,&quot;path&quot;:&quot;/path1&quot;}]</p>
     */
    @NameInMap("configuration")
    public String configuration;

    /**
     * <p>The list of configuration files for the cache cluster.</p>
     */
    @NameInMap("configurations")
    public java.util.List<CacheClusterConfigurations> configurations;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>Fri May 31 12:18:51 CST 2024</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The creator UID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("creator")
    public String creator;

    @NameInMap("extra")
    public String extra;

    /**
     * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717138731701</p>
     */
    @NameInMap("gmtCreated")
    public Long gmtCreated;

    /**
     * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717138731701</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The modifier UID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>The cache cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-cache-cluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek4f7uj74wdthi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The cache cluster specifications.</p>
     */
    @NameInMap("resourceSpec")
    public CacheClusterResourceSpec resourceSpec;

    /**
     * <p>The cache cluster status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The list of data tables associated with the cache cluster.</p>
     */
    @NameInMap("tables")
    public java.util.List<CacheClusterTables> tables;

    /**
     * <p>The list of tags for the cache cluster.</p>
     */
    @NameInMap("tags")
    public java.util.List<CacheClusterTags> tags;

    /**
     * <p>The resource specifications used by the cache cluster.</p>
     */
    @NameInMap("usedResourceSpec")
    public CacheClusterUsedResourceSpec usedResourceSpec;

    /**
     * <p>The cache cluster version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2.0</p>
     */
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

    public CacheCluster setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
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
        /**
         * <p>The name of the cache set.</p>
         * 
         * <strong>example:</strong>
         * <p>cache1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The path of the cache set.</p>
         * 
         * <strong>example:</strong>
         * <p>/path1</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p><cachesets><cacheset><name>cache1</name><path>/path1</path><cacheStrategy>DISTRIBUTED</cacheStrategy><metaPolicy><type>ALWAYS</type></metaPolicy><readPolicy>CACHE_ASIDE</readPolicy><preadPolicy>ALL_DYNAMIC</preadPolicy><writePolicy>WRITE_THROUGH</writePolicy></cacheset></cachesets></p>
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
         * <p>The bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("bandWidth")
        public Long bandWidth;

        /**
         * <p>Specifies whether high availability is enabled.</p>
         */
        @NameInMap("ha")
        public Boolean ha;

        /**
         * <p>The physical storage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
        /**
         * <p>The data catalog ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15097**********</p>
         */
        @NameInMap("catalogId")
        public String catalogId;

        /**
         * <p>The data catalog provider.</p>
         * 
         * <strong>example:</strong>
         * <p>HMS</p>
         */
        @NameInMap("catalogProvider")
        public String catalogProvider;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("database")
        public String database;

        /**
         * <p>The data table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("table")
        public String table;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
         * <p>The used bandwidth.</p>
         */
        @NameInMap("bandWidth")
        public Long bandWidth;

        /**
         * <p>The used storage capacity.</p>
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
