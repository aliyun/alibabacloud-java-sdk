// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dataset object.</p>
     */
    @NameInMap("DatasetDTO")
    public GetDatasetResponseBodyDatasetDTO datasetDTO;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatasetResponseBody setDatasetDTO(GetDatasetResponseBodyDatasetDTO datasetDTO) {
        this.datasetDTO = datasetDTO;
        return this;
    }
    public GetDatasetResponseBodyDatasetDTO getDatasetDTO() {
        return this.datasetDTO;
    }

    public GetDatasetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatasetResponseBodyDatasetDTOOwnerList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetDatasetResponseBodyDatasetDTOOwnerList build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOOwnerList self = new GetDatasetResponseBodyDatasetDTOOwnerList();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOOwnerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDatasetResponseBodyDatasetDTOOwnerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig extends TeaModel {
        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7445343860022804608</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据源</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The development path (not required for basic projects).</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("DevPath")
        public String devPath;

        /**
         * <p>The mount path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/var/run/openresty/cache/corp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The production path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("ProdPath")
        public String prodPath;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig setDevPath(String devPath) {
            this.devPath = devPath;
            return this;
        }
        public String getDevPath() {
            return this.devPath;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig setProdPath(String prodPath) {
            this.prodPath = prodPath;
            return this;
        }
        public String getProdPath() {
            return this.prodPath;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
        /**
         * <p>The embedding dimension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance:mongodb</p>
         */
        @NameInMap("Dimension")
        public Long dimension;

        /**
         * <p>The embedding model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MultiModal-Embedding</p>
         */
        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        /**
         * <p>The index build parameters. Different parameters are required depending on the index type. For example, HNSW requires {M:30, efConstruction:360}, and IVF_FLAT requires {nlist:128}.</p>
         * 
         * <strong>example:</strong>
         * <p>{M:30, efConstruction:360}</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>The index type. PG supports IVFFlat and HNSW. Milvus supports all types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>The similarity type. Default value: COSINE. COSINE corresponds to vector_cosine_ops, L2 corresponds to vector_l2_ops, and IP corresponds to vector_ip_ops.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns extends TeaModel {
        /**
         * <p>The column comment.</p>
         * 
         * <strong>example:</strong>
         * <p>主键</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The array element subtype. This parameter is valid only when type is set to ARRAY.</p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p>The maximum array capacity. This parameter is valid only when type is set to ARRAY. Default value: 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The column name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the column is a primary key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p>The column type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>int8</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the column is a URL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        /**
         * <p>The vector index configuration.</p>
         */
        @NameInMap("VectorIndexConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setVectorIndexConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema extends TeaModel {
        /**
         * <p>The list of columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> columns;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema setColumns(java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig extends TeaModel {
        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7429133693081710272</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据源</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The development database/schema.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("DevSchema")
        public String devSchema;

        /**
         * <p>The storage destination (new table or existing table).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("MetadataStorageMode")
        public String metadataStorageMode;

        /**
         * <p>The metastore type.</p>
         * 
         * <strong>example:</strong>
         * <p>MILVUS</p>
         */
        @NameInMap("MetadataStorageType")
        public String metadataStorageType;

        /**
         * <p>The production database/schema.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML正文提取/test423/</p>
         */
        @NameInMap("ProdSchema")
        public String prodSchema;

        /**
         * <p>The table name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s_crm_all_plt_jala_shop</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The table schema configuration.</p>
         */
        @NameInMap("TableSchema")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema tableSchema;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setDevSchema(String devSchema) {
            this.devSchema = devSchema;
            return this;
        }
        public String getDevSchema() {
            return this.devSchema;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setMetadataStorageMode(String metadataStorageMode) {
            this.metadataStorageMode = metadataStorageMode;
            return this;
        }
        public String getMetadataStorageMode() {
            return this.metadataStorageMode;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setProdSchema(String prodSchema) {
            this.prodSchema = prodSchema;
            return this;
        }
        public String getProdSchema() {
            return this.prodSchema;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig setTableSchema(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
        /**
         * <p>The embedding dimension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Dimension")
        public Long dimension;

        /**
         * <p>The embedding model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>multimodal-embedding-v1</p>
         */
        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        /**
         * <p>The index build parameters.</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>The index type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>The similarity type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns extends TeaModel {
        /**
         * <p>The column comment.</p>
         * 
         * <strong>example:</strong>
         * <p>录入时间</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The array element subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p>The maximum array capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The column name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>happen_time</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the column is a primary key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p>The column type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>date</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the column is a URL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        /**
         * <p>The vector index configuration.</p>
         */
        @NameInMap("VectorIndexConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setVectorIndexConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema extends TeaModel {
        /**
         * <p>The list of columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema setColumns(java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig extends TeaModel {
        /**
         * <p>The data source type of the meta table. Only KAFKA is supported in the current release.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA</p>
         */
        @NameInMap("DatasourceType")
        public String datasourceType;

        /**
         * <p>The meta table name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试元表</p>
         */
        @NameInMap("MetaTableName")
        public String metaTableName;

        /**
         * <p>The project ID to which the meta table belongs. Cross-project references are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7255013756724992</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The table schema configuration (reuses MetadataStorageConfigDTO.TableSchemaDTO).</p>
         */
        @NameInMap("TableSchema")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema tableSchema;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig setMetaTableName(String metaTableName) {
            this.metaTableName = metaTableName;
            return this;
        }
        public String getMetaTableName() {
            return this.metaTableName;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig setTableSchema(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig extends TeaModel {
        /**
         * <p>The file storage configuration.</p>
         */
        @NameInMap("FileStorageConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig fileStorageConfig;

        /**
         * <p>The metastore configuration.</p>
         */
        @NameInMap("MetadataStorageConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig metadataStorageConfig;

        /**
         * <p>The real-time meta table configuration. This parameter takes effect only when metadataStorageType is set to REALTIME_META_TABLE.</p>
         */
        @NameInMap("RealtimeMetaTableConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据集版本</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig self = new GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig setFileStorageConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig fileStorageConfig) {
            this.fileStorageConfig = fileStorageConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigFileStorageConfig getFileStorageConfig() {
            return this.fileStorageConfig;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig setMetadataStorageConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig metadataStorageConfig) {
            this.metadataStorageConfig = metadataStorageConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigMetadataStorageConfig getMetadataStorageConfig() {
            return this.metadataStorageConfig;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig setRealtimeMetaTableConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig) {
            this.realtimeMetaTableConfig = realtimeMetaTableConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfigRealtimeMetaTableConfig getRealtimeMetaTableConfig() {
            return this.realtimeMetaTableConfig;
        }

        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTOVersionList extends TeaModel {
        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The dataset version configuration.</p>
         */
        @NameInMap("DataVersionConfig")
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig dataVersionConfig;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7280832407583104</p>
         */
        @NameInMap("DatasetId")
        public Long datasetId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-13T02:11:56Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1749450490000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7280840713415040</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>V4</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetDatasetResponseBodyDatasetDTOVersionList build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTOVersionList self = new GetDatasetResponseBodyDatasetDTOVersionList();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setDataVersionConfig(GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig dataVersionConfig) {
            this.dataVersionConfig = dataVersionConfig;
            return this;
        }
        public GetDatasetResponseBodyDatasetDTOVersionListDataVersionConfig getDataVersionConfig() {
            return this.dataVersionConfig;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDatasetResponseBodyDatasetDTOVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDatasetResponseBodyDatasetDTO extends TeaModel {
        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The subject area ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78201</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <p>The subject area name.</p>
         * 
         * <strong>example:</strong>
         * <p>离线数据主题域</p>
         */
        @NameInMap("DataCellName")
        public String dataCellName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据集</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The directory (retrieved from the file service by using the fileId).</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7255018404650688</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-28 10:03:49</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-28 10:03:49</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The dataset ID (business primary key).</p>
         * 
         * <strong>example:</strong>
         * <p>7255018404425088</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the development owner.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("LockOwner")
        public String lockOwner;

        /**
         * <p>The display name of the development owner on the interface.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LockOwnerName")
        public String lockOwnerName;

        /**
         * <p>The metastore type.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTGRESQL</p>
         */
        @NameInMap("MetadataStorageType")
        public String metadataStorageType;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>audio_dataset</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<GetDatasetResponseBodyDatasetDTOOwnerList> ownerList;

        /**
         * <p>The ID of the project to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>7255013756724992</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the project to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_tm</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The dataset scenarios. Valid values:</p>
         * <ul>
         * <li>OFFLINE: offline (default).</li>
         * <li>REALTIME: real-time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001413</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The dataset type.</p>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The list of versions.</p>
         */
        @NameInMap("VersionList")
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionList> versionList;

        public static GetDatasetResponseBodyDatasetDTO build(java.util.Map<String, ?> map) throws Exception {
            GetDatasetResponseBodyDatasetDTO self = new GetDatasetResponseBodyDatasetDTO();
            return TeaModel.build(map, self);
        }

        public GetDatasetResponseBodyDatasetDTO setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetDatasetResponseBodyDatasetDTO setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDatasetResponseBodyDatasetDTO setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetDatasetResponseBodyDatasetDTO setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public GetDatasetResponseBodyDatasetDTO setDataCellName(String dataCellName) {
            this.dataCellName = dataCellName;
            return this;
        }
        public String getDataCellName() {
            return this.dataCellName;
        }

        public GetDatasetResponseBodyDatasetDTO setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDatasetResponseBodyDatasetDTO setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetDatasetResponseBodyDatasetDTO setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetDatasetResponseBodyDatasetDTO setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDatasetResponseBodyDatasetDTO setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDatasetResponseBodyDatasetDTO setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDatasetResponseBodyDatasetDTO setLockOwner(String lockOwner) {
            this.lockOwner = lockOwner;
            return this;
        }
        public String getLockOwner() {
            return this.lockOwner;
        }

        public GetDatasetResponseBodyDatasetDTO setLockOwnerName(String lockOwnerName) {
            this.lockOwnerName = lockOwnerName;
            return this;
        }
        public String getLockOwnerName() {
            return this.lockOwnerName;
        }

        public GetDatasetResponseBodyDatasetDTO setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public GetDatasetResponseBodyDatasetDTO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDatasetResponseBodyDatasetDTO setOwnerList(java.util.List<GetDatasetResponseBodyDatasetDTOOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDatasetDTOOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public GetDatasetResponseBodyDatasetDTO setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDatasetResponseBodyDatasetDTO setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetDatasetResponseBodyDatasetDTO setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public GetDatasetResponseBodyDatasetDTO setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public GetDatasetResponseBodyDatasetDTO setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetDatasetResponseBodyDatasetDTO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDatasetResponseBodyDatasetDTO setVersionList(java.util.List<GetDatasetResponseBodyDatasetDTOVersionList> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<GetDatasetResponseBodyDatasetDTOVersionList> getVersionList() {
            return this.versionList;
        }

    }

}
