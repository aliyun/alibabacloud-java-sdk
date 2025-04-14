// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Table extends TeaModel {
    @NameInMap("BusinessMetadata")
    public TableBusinessMetadata businessMetadata;

    /**
     * <strong>example:</strong>
     * <p>测试表</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-table:123456::test_project::test_tbl</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>maxcompute-project:123456::test_project</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    @NameInMap("PartitionKeys")
    public java.util.List<String> partitionKeys;

    /**
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("TableType")
    public String tableType;

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
         * <strong>example:</strong>
         * <p>CATEGORY.456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>测试类目</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FavorCount")
        public Long favorCount;

        /**
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
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
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
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
        @NameInMap("Categories")
        public java.util.List<java.util.List<TableBusinessMetadataCategories>> categories;

        @NameInMap("Extension")
        public TableBusinessMetadataExtension extension;

        /**
         * <strong>example:</strong>
         * <h2>使用说明</h2>
         */
        @NameInMap("Readme")
        public String readme;

        @NameInMap("Tags")
        public java.util.List<TableBusinessMetadataTags> tags;

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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Compressed")
        public Boolean compressed;

        /**
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetInputFormat</p>
         */
        @NameInMap("InputFormat")
        public String inputFormat;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/test_tbl</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.MapredParquetOutputFormat</p>
         */
        @NameInMap("OutputFormat")
        public String outputFormat;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Parameters")
        public java.util.Map<String, String> parameters;

        /**
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
