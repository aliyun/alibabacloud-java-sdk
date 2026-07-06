// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    /**
     * <p>The business metadata related to DataWorks, including usage instructions, tags, categories, upstream production nodes, and extended information.</p>
     */
    @NameInMap("BusinessMetadata")
    public TableBusinessMetadata businessMetadata;

    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>测试表</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time, in millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <p>The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}:${PatternName}:${TableName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
     * <blockquote>
     * <p>For maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name. Projects with the three-layer model enabled require a schema name. For projects without the three-layer model enabled, use an empty string as a placeholder for the schema name.</p>
     * </blockquote>
     * <blockquote>
     * <p>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
     * </blockquote>
     * <p>The following examples show the ID formats for common types:</p>
     * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
     * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
     * <p><code>hms-table:instance_id::database_name::table_name</code></p>
     * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
     * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
     * <blockquote>
     * <p>Where<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name. For the maxcompute type, this is required only when the three-layer model is enabled for the project. If the three-layer model is not enabled, use an empty string as a placeholder.<br><code>table_name</code>: The table name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf-table::catalog_id:database_name::table_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The modification time, in millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent-level metadata entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
     * <ul>
     * <li><p>For types that support schemas (<code>maxcompute/holo/postgresql/sqlserver/hybriddb_for_postgresql/oracle, where the maxcompute type requires the Layer 3 model to be enabled for the project</code>), ParentMetaEntityId is the database pattern to which the table belongs. The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}:${PatternName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
     * </li>
     * <li><p>For other types, ParentMetaEntityId is the database to which the table belongs. The format is <code>${EntityType}:${instance ID or encoded URL}:${DataFolderIdentity}:${DatabaseName}</code>. Use an empty character as a placeholder for levels that do not exist.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For maxcompute and dlf types, use an empty string as a placeholder for the instance ID. For the maxcompute type, the database name is the MaxCompute project name.</p>
     * </blockquote>
     * <blockquote>
     * <p>For the starrocks type, the data catalog identifier is the catalog name. For the dlf type, the data catalog identifier is the catalog ID. Other types do not support the catalog level. Use an empty string as a placeholder.</p>
     * </blockquote>
     * <p>The following examples show the ParentMetaEntityId formats for common types:</p>
     * <p><code>maxcompute-project:::project_name</code></p>
     * <p><code>maxcompute-schema:::project_name:schema_name</code> (only when the three-layer model is enabled for the project)</p>
     * <p><code>dlf-database::catalog_id:database_name</code></p>
     * <p><code>hms-database:instance_id::database_name</code></p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * <blockquote>
     * <p>Where<br><code>instance_id</code>: The instance ID. This is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. This is required when the data source is registered by using a connection string.<br><code>catalog_id</code>: The DLF catalog ID.<br><code>project_name</code>: The MaxCompute project name.<br><code>database_name</code>: The database name.<br><code>schema_name</code>: The schema name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dlf-database::catalog_id:database_name</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The list of partition keys. This is empty for non-partitioned tables.</p>
     */
    @NameInMap("PartitionKeys")
    public java.util.List<String> partitionKeys;

    @NameInMap("StatisticsInfos")
    public java.util.Map<String, String> statisticsInfos;

    /**
     * <p>The table type. The valid values depend on the metadata collector type.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

    /**
     * <p>The technical metadata.</p>
     */
    @NameInMap("TechnicalMetadata")
    public TableTechnicalMetadata technicalMetadata;

    public static Table build(java.util.Map<String, ?> map) throws Exception {
        Table self = new Table();
        return TeaModel.build(map, self);
    }

    public Table setBusinessMetadata(TableBusinessMetadata businessMetadata) {
        this.businessMetadata = businessMetadata;
        return this;
    }
    public TableBusinessMetadata getBusinessMetadata() {
        return this.businessMetadata;
    }

    public Table setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Table setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Table setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Table setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Table setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Table setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    public Table setPartitionKeys(java.util.List<String> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    public Table setStatisticsInfos(java.util.Map<String, String> statisticsInfos) {
        this.statisticsInfos = statisticsInfos;
        return this;
    }
    public java.util.Map<String, String> getStatisticsInfos() {
        return this.statisticsInfos;
    }

    public Table setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

    public Table setTechnicalMetadata(TableTechnicalMetadata technicalMetadata) {
        this.technicalMetadata = technicalMetadata;
        return this;
    }
    public TableTechnicalMetadata getTechnicalMetadata() {
        return this.technicalMetadata;
    }

    public static class TableBusinessMetadataCategories extends TeaModel {
        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CATEGORY.456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试类目</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parent category ID. This parameter can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>CATEGORY.123</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static TableBusinessMetadataCategories build(java.util.Map<String, ?> map) throws Exception {
            TableBusinessMetadataCategories self = new TableBusinessMetadataCategories();
            return TeaModel.build(map, self);
        }

        public TableBusinessMetadataCategories setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TableBusinessMetadataCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TableBusinessMetadataCategories setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

    public static class TableBusinessMetadataExtension extends TeaModel {
        /**
         * <p>The environment type. Valid values:</p>
         * <ul>
         * <li>Prod: Production environment.</li>
         * <li>Dev: Development environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The favorite count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FavorCount")
        public Long favorCount;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The read count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <p>The view count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ViewCount")
        public Long viewCount;

        public static TableBusinessMetadataExtension build(java.util.Map<String, ?> map) throws Exception {
            TableBusinessMetadataExtension self = new TableBusinessMetadataExtension();
            return TeaModel.build(map, self);
        }

        public TableBusinessMetadataExtension setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public TableBusinessMetadataExtension setFavorCount(Long favorCount) {
            this.favorCount = favorCount;
            return this;
        }
        public Long getFavorCount() {
            return this.favorCount;
        }

        public TableBusinessMetadataExtension setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TableBusinessMetadataExtension setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public TableBusinessMetadataExtension setViewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Long getViewCount() {
            return this.viewCount;
        }

    }

    public static class TableBusinessMetadataTags extends TeaModel {
        /**
         * <p>The tag key. This parameter cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static TableBusinessMetadataTags build(java.util.Map<String, ?> map) throws Exception {
            TableBusinessMetadataTags self = new TableBusinessMetadataTags();
            return TeaModel.build(map, self);
        }

        public TableBusinessMetadataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TableBusinessMetadataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TableBusinessMetadataUpstreamTasks extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_task</p>
         */
        @NameInMap("Name")
        public String name;

        public static TableBusinessMetadataUpstreamTasks build(java.util.Map<String, ?> map) throws Exception {
            TableBusinessMetadataUpstreamTasks self = new TableBusinessMetadataUpstreamTasks();
            return TeaModel.build(map, self);
        }

        public TableBusinessMetadataUpstreamTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TableBusinessMetadataUpstreamTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TableBusinessMetadata extends TeaModel {
        /**
         * <p>The list of categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<java.util.List<TableBusinessMetadataCategories>> categories;

        /**
         * <p>The custom attribute values, where key is the custom attribute identifier and value is the list of attribute values.</p>
         */
        @NameInMap("CustomAttributes")
        public java.util.Map<String, java.util.List<String>> customAttributes;

        /**
         * <p>The extension information. Currently only supported for MaxCompute type.</p>
         */
        @NameInMap("Extension")
        public TableBusinessMetadataExtension extension;

        /**
         * <p>The usage instructions.</p>
         * 
         * <strong>example:</strong>
         * <h2>使用说明</h2>
         */
        @NameInMap("Readme")
        public String readme;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<TableBusinessMetadataTags> tags;

        /**
         * <p>The list of upstream nodes.</p>
         */
        @NameInMap("UpstreamTasks")
        public java.util.List<TableBusinessMetadataUpstreamTasks> upstreamTasks;

        public static TableBusinessMetadata build(java.util.Map<String, ?> map) throws Exception {
            TableBusinessMetadata self = new TableBusinessMetadata();
            return TeaModel.build(map, self);
        }

        public TableBusinessMetadata setCategories(java.util.List<java.util.List<TableBusinessMetadataCategories>> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<java.util.List<TableBusinessMetadataCategories>> getCategories() {
            return this.categories;
        }

        public TableBusinessMetadata setCustomAttributes(java.util.Map<String, java.util.List<String>> customAttributes) {
            this.customAttributes = customAttributes;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getCustomAttributes() {
            return this.customAttributes;
        }

        public TableBusinessMetadata setExtension(TableBusinessMetadataExtension extension) {
            this.extension = extension;
            return this;
        }
        public TableBusinessMetadataExtension getExtension() {
            return this.extension;
        }

        public TableBusinessMetadata setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public TableBusinessMetadata setTags(java.util.List<TableBusinessMetadataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<TableBusinessMetadataTags> getTags() {
            return this.tags;
        }

        public TableBusinessMetadata setUpstreamTasks(java.util.List<TableBusinessMetadataUpstreamTasks> upstreamTasks) {
            this.upstreamTasks = upstreamTasks;
            return this;
        }
        public java.util.List<TableBusinessMetadataUpstreamTasks> getUpstreamTasks() {
            return this.upstreamTasks;
        }

    }

    public static class TableTechnicalMetadata extends TeaModel {
        /**
         * <p>Indicates whether the table is compressed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Compressed")
        public Boolean compressed;

        /**
         * <p>The input format.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
         */
        @NameInMap("InputFormat")
        public String inputFormat;

        /**
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test_tbl</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The output format.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat</p>
         */
        @NameInMap("OutputFormat")
        public String outputFormat;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameter information.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The class used by SerDe.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe</p>
         */
        @NameInMap("SerializationLibrary")
        public String serializationLibrary;

        public static TableTechnicalMetadata build(java.util.Map<String, ?> map) throws Exception {
            TableTechnicalMetadata self = new TableTechnicalMetadata();
            return TeaModel.build(map, self);
        }

        public TableTechnicalMetadata setCompressed(Boolean compressed) {
            this.compressed = compressed;
            return this;
        }
        public Boolean getCompressed() {
            return this.compressed;
        }

        public TableTechnicalMetadata setInputFormat(String inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public String getInputFormat() {
            return this.inputFormat;
        }

        public TableTechnicalMetadata setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public TableTechnicalMetadata setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

        public TableTechnicalMetadata setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TableTechnicalMetadata setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public TableTechnicalMetadata setSerializationLibrary(String serializationLibrary) {
            this.serializationLibrary = serializationLibrary;
            return this;
        }
        public String getSerializationLibrary() {
            return this.serializationLibrary;
        }

    }

}
