// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDatasetsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged result.</p>
     */
    @NameInMap("PageResult")
    public ListDatasetsResponseBodyPageResult pageResult;

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

    public static ListDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsResponseBody self = new ListDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDatasetsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDatasetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatasetsResponseBody setPageResult(ListDatasetsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDatasetsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatasetsResponseBodyPageResultResultDataOwnerList extends TeaModel {
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

        public static ListDatasetsResponseBodyPageResultResultDataOwnerList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataOwnerList self = new ListDatasetsResponseBodyPageResultResultDataOwnerList();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataOwnerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListDatasetsResponseBodyPageResultResultDataOwnerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig extends TeaModel {
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

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig setDevPath(String devPath) {
            this.devPath = devPath;
            return this;
        }
        public String getDevPath() {
            return this.devPath;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig setProdPath(String prodPath) {
            this.prodPath = prodPath;
            return this;
        }
        public String getProdPath() {
            return this.prodPath;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
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
         * <p>The index build parameters.</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>The index type. PG supports IVFFlat and HNSW. Milvus supports all index types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>The similarity type. Default value: COSINE. Valid values: COSINE, L2, and IP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns extends TeaModel {
        /**
         * <p>The field description.</p>
         * 
         * <strong>example:</strong>
         * <p>主键</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The array element subtype. This parameter takes effect only when type is set to ARRAY.</p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p>The maximum array capacity. This parameter takes effect only when type is set to ARRAY. Default value: 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The field name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the field is a primary key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p>The field type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>int8</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the field is a URL.</p>
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
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns setVectorIndexConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema extends TeaModel {
        /**
         * <p>The field list.</p>
         */
        @NameInMap("Columns")
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> columns;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema setColumns(java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig extends TeaModel {
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
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema tableSchema;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setDevSchema(String devSchema) {
            this.devSchema = devSchema;
            return this;
        }
        public String getDevSchema() {
            return this.devSchema;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setMetadataStorageMode(String metadataStorageMode) {
            this.metadataStorageMode = metadataStorageMode;
            return this;
        }
        public String getMetadataStorageMode() {
            return this.metadataStorageMode;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setProdSchema(String prodSchema) {
            this.prodSchema = prodSchema;
            return this;
        }
        public String getProdSchema() {
            return this.prodSchema;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig setTableSchema(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
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
         * <p>The index type. PG supports IVFFlat and HNSW. Milvus supports all index types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTOINDEX</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>The similarity type. Default value: COSINE. Valid values: COSINE, L2, and IP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>COSINE</p>
         */
        @NameInMap("SimilarityType")
        public String similarityType;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns extends TeaModel {
        /**
         * <p><strong>The field description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>录入时间</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p><strong>The array element subtype. This parameter takes effect only when type is set to ARRAY.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p><strong>The maximum array capacity. This parameter takes effect only when type is set to ARRAY. Default value: 4096.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p><strong>The field name.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>happen_time</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the field is a primary key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pk")
        public Boolean pk;

        /**
         * <p><strong>The field type.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>date</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the field is a URL.</p>
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
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns setVectorIndexConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema extends TeaModel {
        /**
         * <p>The field list.</p>
         */
        @NameInMap("Columns")
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema setColumns(java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig extends TeaModel {
        /**
         * <p>The meta table data source type (only KAFKA is available in this release).</p>
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
         * <p>The project ID of the meta table (cross-project access is supported).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7128268454335680</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The table schema configuration (reuses <code>MetadataStorageConfigDTO.TableSchemaDTO</code>).</p>
         */
        @NameInMap("TableSchema")
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema tableSchema;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig setMetaTableName(String metaTableName) {
            this.metaTableName = metaTableName;
            return this;
        }
        public String getMetaTableName() {
            return this.metaTableName;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig setTableSchema(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig extends TeaModel {
        /**
         * <p>The file storage configuration.</p>
         */
        @NameInMap("FileStorageConfig")
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig fileStorageConfig;

        /**
         * <p>The metastore configuration.</p>
         */
        @NameInMap("MetadataStorageConfig")
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig metadataStorageConfig;

        /**
         * <p>The real-time meta table configuration (takes effect only when <code>metadataStorageType=REALTIME_META_TABLE</code>).</p>
         */
        @NameInMap("RealtimeMetaTableConfig")
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试数据集版本</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig self = new ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig setFileStorageConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig fileStorageConfig) {
            this.fileStorageConfig = fileStorageConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigFileStorageConfig getFileStorageConfig() {
            return this.fileStorageConfig;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig setMetadataStorageConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig metadataStorageConfig) {
            this.metadataStorageConfig = metadataStorageConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigMetadataStorageConfig getMetadataStorageConfig() {
            return this.metadataStorageConfig;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig setRealtimeMetaTableConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig) {
            this.realtimeMetaTableConfig = realtimeMetaTableConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfigRealtimeMetaTableConfig getRealtimeMetaTableConfig() {
            return this.realtimeMetaTableConfig;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultDataVersionList extends TeaModel {
        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The dataset version configuration.</p>
         */
        @NameInMap("DataVersionConfig")
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig dataVersionConfig;

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
         * <p>2026-04-28 10:03:49</p>
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

        public static ListDatasetsResponseBodyPageResultResultDataVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultDataVersionList self = new ListDatasetsResponseBodyPageResultResultDataVersionList();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setDataVersionConfig(ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig dataVersionConfig) {
            this.dataVersionConfig = dataVersionConfig;
            return this;
        }
        public ListDatasetsResponseBodyPageResultResultDataVersionListDataVersionConfig getDataVersionConfig() {
            return this.dataVersionConfig;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDatasetsResponseBodyPageResultResultDataVersionList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListDatasetsResponseBodyPageResultResultData extends TeaModel {
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
         * <p>The data domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74280</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <p><strong>The data domain name.</strong></p>
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
         * <p>The directory (retrieved from the file service by fileId).</p>
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
         * <p>7285340579984832</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-18 17:07:54.237771</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-18 17:07:54.237771</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The dataset ID (business primary key).</p>
         * 
         * <strong>example:</strong>
         * <p>7128268454335680</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The development owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>300001391</p>
         */
        @NameInMap("LockOwner")
        public String lockOwner;

        /**
         * <p>The name of the development owner (interface Displayed Fields).</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LockOwnerName")
        public String lockOwnerName;

        /**
         * <p><strong>The metastore type.</strong></p>
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
         * <p>The owner list.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataOwnerList> ownerList;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7290731813137728</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The project name.</p>
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
         * <p><strong>The storage type.</strong></p>
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
         * <p><strong>The dataset type.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>HYBRID</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version list.</p>
         */
        @NameInMap("VersionList")
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionList> versionList;

        public static ListDatasetsResponseBodyPageResultResultData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResultResultData self = new ListDatasetsResponseBodyPageResultResultData();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResultResultData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListDatasetsResponseBodyPageResultResultData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDatasetsResponseBodyPageResultResultData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListDatasetsResponseBodyPageResultResultData setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public ListDatasetsResponseBodyPageResultResultData setDataCellName(String dataCellName) {
            this.dataCellName = dataCellName;
            return this;
        }
        public String getDataCellName() {
            return this.dataCellName;
        }

        public ListDatasetsResponseBodyPageResultResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatasetsResponseBodyPageResultResultData setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListDatasetsResponseBodyPageResultResultData setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListDatasetsResponseBodyPageResultResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDatasetsResponseBodyPageResultResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDatasetsResponseBodyPageResultResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDatasetsResponseBodyPageResultResultData setLockOwner(String lockOwner) {
            this.lockOwner = lockOwner;
            return this;
        }
        public String getLockOwner() {
            return this.lockOwner;
        }

        public ListDatasetsResponseBodyPageResultResultData setLockOwnerName(String lockOwnerName) {
            this.lockOwnerName = lockOwnerName;
            return this;
        }
        public String getLockOwnerName() {
            return this.lockOwnerName;
        }

        public ListDatasetsResponseBodyPageResultResultData setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public ListDatasetsResponseBodyPageResultResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasetsResponseBodyPageResultResultData setOwnerList(java.util.List<ListDatasetsResponseBodyPageResultResultDataOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public ListDatasetsResponseBodyPageResultResultData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDatasetsResponseBodyPageResultResultData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDatasetsResponseBodyPageResultResultData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListDatasetsResponseBodyPageResultResultData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListDatasetsResponseBodyPageResultResultData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDatasetsResponseBodyPageResultResultData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasetsResponseBodyPageResultResultData setVersionList(java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionList> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<ListDatasetsResponseBodyPageResultResultDataVersionList> getVersionList() {
            return this.versionList;
        }

    }

    public static class ListDatasetsResponseBodyPageResult extends TeaModel {
        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The object.</p>
         */
        @NameInMap("ResultData")
        public java.util.List<ListDatasetsResponseBodyPageResultResultData> resultData;

        public static ListDatasetsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetsResponseBodyPageResult self = new ListDatasetsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDatasetsResponseBodyPageResult setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListDatasetsResponseBodyPageResult setResultData(java.util.List<ListDatasetsResponseBodyPageResultResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<ListDatasetsResponseBodyPageResultResultData> getResultData() {
            return this.resultData;
        }

    }

}
