// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    /**
     * <p>The information about the business metadata that is related to DataWorks, including the usage notes, tags, categories, ancestor tasks, and extended information.</p>
     */
    @NameInMap("BusinessMetadata")
    public TableBusinessMetadata businessMetadata;

    /**
     * <p>The comments.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The table ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}:${Table name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
     * <blockquote>
     * <p> For MaxCompute and DLF tables, specify an empty string at the Instance ID level as a placeholder. For MaxCompute tables, specify a MaxCompute project name at the Database name level. If the three-layer model is enabled for your MaxCompute project, you must specify a schema name at the Schema name level. Otherwise, you can specify an empty string at the Schema name level as a placeholder.</p>
     * </blockquote>
     * <blockquote>
     * <p> For StarRocks tables, specify a catalog name at the Catalog identifier level. For DLF tables, specify a catalog ID at the Catalog identifier level. Other types of tables do not support the Catalog identifier level, and you can specify an empty string as a placeholder.</p>
     * </blockquote>
     * <p>You can configure this parameter in one of the following formats based on your table type:</p>
     * <p><code>maxcompute-table:::project_name:[schema_name]:table_name</code></p>
     * <p><code>dlf-table::catalog_id:database_name::table_name</code></p>
     * <p><code>hms-table:instance_id::database_name::table_name</code></p>
     * <p><code>holo-table:instance_id::database_name:schema_name:table_name</code></p>
     * <p><code>mysql-table:(instance_id|encoded_jdbc_url)::database_name::table_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.\
     * <code>catalog_id</code>: the ID of a DLF catalog.\
     * <code>project_name</code>: the name of a MaxCompute project.\
     * <code>database_name</code>: the name of a database.\
     * <code>schema_name</code>: the name of a schema. For a MaxCompute table, this parameter is required only if the three-layer model is enabled for the MaxCompute project to which the table belongs. If the schema feature is not enabled for the MaxCompute project, specify an empty string for this parameter as a placeholder.\
     * <code>table_name</code>: the name of a table.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:123456XXX::test_project::test_tbl
     * dlf-table:123456XXX:test_catalog:test_db::test_tbl
     * hms-table:c-abc123xxx::test_db::test_tbl
     * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The modification time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of a parent metadata entity. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <ul>
     * <li>For data source types that support schemas, such as <code>MaxCompute, Hologres, PostgreSQL, SQL Server, HybridDB for PostgreSQL, and Oracle</code>, the <code>ParentMetaEntityId</code> parameter specifies the schema of the database to which the table belongs. In this case, the common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}:${Schema name}</code>. If a level does not exist, leave the level empty. For a MaxCompute data table, you must make sure that the three-layer model is enabled for the MaxCompute project to which the table belongs.</li>
     * <li>For other data source types that do not support schemas, the <code>ParentMetaEntityId</code> parameter specifies the database to which the table belongs. In this case, the common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}</code>. If a level does not exist, leave the level empty.</li>
     * </ul>
     * <blockquote>
     * <p> For MaxCompute and DLF tables, specify an empty string at the Instance ID level as a placeholder. For MaxCompute tables, specify a MaxCompute project name at the Database name level.</p>
     * </blockquote>
     * <blockquote>
     * <p> For StarRocks tables, specify a catalog name at the Catalog identifier level. For DLF tables, specify a catalog ID at the Catalog identifier level. Other types of tables do not support the Catalog identifier level, and you can specify an empty string as a placeholder.</p>
     * </blockquote>
     * <p>You can configure this parameter in one of the following formats based on your table type:</p>
     * <p><code>maxcompute-project:::project_name</code></p>
     * <p><code>maxcompute-schema:::project_name:schema_name</code> (Three-layer model enabled for the MaxCompute project)</p>
     * <p><code>dlf-database::catalog_id:database_name</code></p>
     * <p><code>hms-database:instance_id::database_name</code></p>
     * <p><code>holo-schema:instance_id::database_name:schema_name</code></p>
     * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * <blockquote>
     * <p>\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.\
     * <code>catalog_id</code>: the ID of a DLF catalog.\
     * <code>project_name</code>: the name of a MaxCompute project.\
     * <code>database_name</code>: the name of a database.\
     * <code>schema_name</code>: the name of a schema.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-schema:123456XXX::test_project_with_schema:default
     * maxcompute-project:123456XXX::test_project_without_schema
     * dlf-database:123456XXX:test_catalog:test_db
     * hms-database:c-abc123xxx::test_db
     * holo-schema:h-abc123xxx::test_db:test_schema</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    /**
     * <p>The partition keys. If the table is a non-partitioned table, leave this parameter empty.</p>
     */
    @NameInMap("PartitionKeys")
    public java.util.List<String> partitionKeys;

    /**
     * <p>The table type. The value of this parameter is related to the type of metadata crawler.</p>
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
         * <p>The category name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parent category ID. You can leave this parameter empty.</p>
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
         * <p>The type of the environment. Valid values:</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The number of times the table is added to favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FavorCount")
        public Long favorCount;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The number of times the table is read.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <p>The number of times the table is viewed.</p>
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
         * <p>The tag key. You cannot leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can leave this parameter empty.</p>
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
         * <p>The ancestor task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ancestor task name.</p>
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
         * <p>The categories.</p>
         */
        @NameInMap("Categories")
        public java.util.List<java.util.List<TableBusinessMetadataCategories>> categories;

        /**
         * <p>The extended information. Only MaxCompute tables supports this parameter.</p>
         */
        @NameInMap("Extension")
        public TableBusinessMetadataExtension extension;

        /**
         * <p>The usage notes.</p>
         */
        @NameInMap("Readme")
        public String readme;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<TableBusinessMetadataTags> tags;

        /**
         * <p>The ancestor tasks.</p>
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
         * <p>Specifies whether the table is a compressed table. Valid values: true and false.</p>
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
         * <p>The storage location of the table.</p>
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
         * <p>The table owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The information about parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The implementation class of SerDe.</p>
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
