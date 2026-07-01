// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7273382541481536</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDatasetRequestUpdateCommand updateCommand;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDatasetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDatasetRequest setUpdateCommand(UpdateDatasetRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDatasetRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7445343860022804608</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>测试数据源</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("DevPath")
        public String devPath;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/var/run/openresty/cache/corp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("ProdPath")
        public String prodPath;

        public static UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig self = new UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig setDevPath(String devPath) {
            this.devPath = devPath;
            return this;
        }
        public String getDevPath() {
            return this.devPath;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig setProdPath(String prodPath) {
            this.prodPath = prodPath;
            return this;
        }
        public String getProdPath() {
            return this.prodPath;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance:mongodb</p>
         */
        @NameInMap("Dimension")
        public Long dimension;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MultiModal-Embedding</p>
         */
        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        /**
         * <strong>example:</strong>
         * <p>{M:30, efConstruction:360}</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig self = new UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>primary key</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>int8</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        @NameInMap("VectorIndexConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns self = new UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setVectorIndexConfig(UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> columns;

        public static UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema self = new UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema setColumns(java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7429133693081710272</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>测试数据源</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("DevSchema")
        public String devSchema;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("MetadataStorageMode")
        public String metadataStorageMode;

        /**
         * <strong>example:</strong>
         * <p>MILVUS</p>
         */
        @NameInMap("MetadataStorageType")
        public String metadataStorageType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("ProdSchema")
        public String prodSchema;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s_crm_all_plt_jala_shop</p>
         */
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableSchema")
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema tableSchema;

        public static UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig self = new UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setDevSchema(String devSchema) {
            this.devSchema = devSchema;
            return this;
        }
        public String getDevSchema() {
            return this.devSchema;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setMetadataStorageMode(String metadataStorageMode) {
            this.metadataStorageMode = metadataStorageMode;
            return this;
        }
        public String getMetadataStorageMode() {
            return this.metadataStorageMode;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setProdSchema(String prodSchema) {
            this.prodSchema = prodSchema;
            return this;
        }
        public String getProdSchema() {
            return this.prodSchema;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig setTableSchema(UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Dimension")
        public Long dimension;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>multimodal-embedding-v1</p>
         */
        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        /**
         * <strong>example:</strong>
         * <p>{M:30, efConstruction:360}</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig self = new UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>happen time</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>happen_time</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>date</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        @NameInMap("VectorIndexConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns self = new UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setVectorIndexConfig(UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns;

        public static UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema self = new UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema setColumns(java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA</p>
         */
        @NameInMap("DatasourceType")
        public String datasourceType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试元表</p>
         */
        @NameInMap("MetaTableName")
        public String metaTableName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7255013756724992</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("TableSchema")
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema tableSchema;

        public static UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig self = new UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig setMetaTableName(String metaTableName) {
            this.metaTableName = metaTableName;
            return this;
        }
        public String getMetaTableName() {
            return this.metaTableName;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig setTableSchema(UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class UpdateDatasetRequestUpdateCommandVersionConfig extends TeaModel {
        @NameInMap("FileStorageConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig fileStorageConfig;

        @NameInMap("MetadataStorageConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig metadataStorageConfig;

        @NameInMap("RealtimeMetaTableConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig;

        /**
         * <strong>example:</strong>
         * <p>测试数据集版本</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static UpdateDatasetRequestUpdateCommandVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommandVersionConfig self = new UpdateDatasetRequestUpdateCommandVersionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommandVersionConfig setFileStorageConfig(UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig fileStorageConfig) {
            this.fileStorageConfig = fileStorageConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigFileStorageConfig getFileStorageConfig() {
            return this.fileStorageConfig;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfig setMetadataStorageConfig(UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig metadataStorageConfig) {
            this.metadataStorageConfig = metadataStorageConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigMetadataStorageConfig getMetadataStorageConfig() {
            return this.metadataStorageConfig;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfig setRealtimeMetaTableConfig(UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig) {
            this.realtimeMetaTableConfig = realtimeMetaTableConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfigRealtimeMetaTableConfig getRealtimeMetaTableConfig() {
            return this.realtimeMetaTableConfig;
        }

        public UpdateDatasetRequestUpdateCommandVersionConfig setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class UpdateDatasetRequestUpdateCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>78201</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <strong>example:</strong>
         * <p>测试数据集</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7261110566632832</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7280832407583104</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>POSTGRESQL</p>
         */
        @NameInMap("MetadataStorageType")
        public String metadataStorageType;

        /**
         * <strong>example:</strong>
         * <p>audio_dataset</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("Version")
        public String version;

        @NameInMap("VersionConfig")
        public UpdateDatasetRequestUpdateCommandVersionConfig versionConfig;

        public static UpdateDatasetRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDatasetRequestUpdateCommand self = new UpdateDatasetRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDatasetRequestUpdateCommand setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateDatasetRequestUpdateCommand setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public UpdateDatasetRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDatasetRequestUpdateCommand setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public UpdateDatasetRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDatasetRequestUpdateCommand setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public UpdateDatasetRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDatasetRequestUpdateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateDatasetRequestUpdateCommand setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public UpdateDatasetRequestUpdateCommand setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public UpdateDatasetRequestUpdateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateDatasetRequestUpdateCommand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateDatasetRequestUpdateCommand setVersionConfig(UpdateDatasetRequestUpdateCommandVersionConfig versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public UpdateDatasetRequestUpdateCommandVersionConfig getVersionConfig() {
            return this.versionConfig;
        }

    }

}
