// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The creation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDatasetRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7255013756724992</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setCreateCommand(CreateDatasetRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDatasetRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDatasetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateDatasetRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public CreateDatasetRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class CreateDatasetRequestCreateCommandApiInfoRequestParamList extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Descr")
        public String descr;

        /**
         * <p>Specifies whether the parameter is a URL parameter.</p>
         */
        @NameInMap("IsUrl")
        public Boolean isUrl;

        /**
         * <p>Specifies whether the parameter is required.</p>
         */
        @NameInMap("Must")
        public Boolean must;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>col01</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        public static CreateDatasetRequestCreateCommandApiInfoRequestParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandApiInfoRequestParamList self = new CreateDatasetRequestCreateCommandApiInfoRequestParamList();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setDescr(String descr) {
            this.descr = descr;
            return this;
        }
        public String getDescr() {
            return this.descr;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setIsUrl(Boolean isUrl) {
            this.isUrl = isUrl;
            return this;
        }
        public Boolean getIsUrl() {
            return this.isUrl;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setMust(Boolean must) {
            this.must = must;
            return this;
        }
        public Boolean getMust() {
            return this.must;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public CreateDatasetRequestCreateCommandApiInfoRequestParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

    }

    public static class CreateDatasetRequestCreateCommandApiInfoResponseParamList extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Descr")
        public String descr;

        /**
         * <p>Specifies whether the parameter is a URL parameter.</p>
         */
        @NameInMap("IsUrl")
        public Boolean isUrl;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>col01</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The type of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sample")
        public String sample;

        public static CreateDatasetRequestCreateCommandApiInfoResponseParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandApiInfoResponseParamList self = new CreateDatasetRequestCreateCommandApiInfoResponseParamList();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandApiInfoResponseParamList setDescr(String descr) {
            this.descr = descr;
            return this;
        }
        public String getDescr() {
            return this.descr;
        }

        public CreateDatasetRequestCreateCommandApiInfoResponseParamList setIsUrl(Boolean isUrl) {
            this.isUrl = isUrl;
            return this;
        }
        public Boolean getIsUrl() {
            return this.isUrl;
        }

        public CreateDatasetRequestCreateCommandApiInfoResponseParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public CreateDatasetRequestCreateCommandApiInfoResponseParamList setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public CreateDatasetRequestCreateCommandApiInfoResponseParamList setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

    }

    public static class CreateDatasetRequestCreateCommandApiInfo extends TeaModel {
        /**
         * <p>The execution timeout period in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ExecTimeout")
        public Integer execTimeout;

        /**
         * <p>The execution mode. Valid values: 1: Synchronous. 2: Asynchronous.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteMode")
        public Integer executeMode;

        /**
         * <p>The data service API group.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("OsApiGroup")
        public Integer osApiGroup;

        /**
         * <p>The data service project.</p>
         * 
         * <strong>example:</strong>
         * <p>1022</p>
         */
        @NameInMap("OsProject")
        public Integer osProject;

        /**
         * <p>The protocol type. Valid values: 1: HTTPS. 2: HTTP. 3: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Protocol")
        public Integer protocol;

        /**
         * <p>The request method. Valid values: 1: GET. 2: LIST.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RequestMethod")
        public Integer requestMethod;

        /**
         * <p>The list of request parameters.</p>
         */
        @NameInMap("RequestParamList")
        public java.util.List<CreateDatasetRequestCreateCommandApiInfoRequestParamList> requestParamList;

        /**
         * <p>The list of response parameters.</p>
         */
        @NameInMap("ResponseParamList")
        public java.util.List<CreateDatasetRequestCreateCommandApiInfoResponseParamList> responseParamList;

        /**
         * <p>The timeout period in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateDatasetRequestCreateCommandApiInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandApiInfo self = new CreateDatasetRequestCreateCommandApiInfo();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandApiInfo setExecTimeout(Integer execTimeout) {
            this.execTimeout = execTimeout;
            return this;
        }
        public Integer getExecTimeout() {
            return this.execTimeout;
        }

        public CreateDatasetRequestCreateCommandApiInfo setExecuteMode(Integer executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public Integer getExecuteMode() {
            return this.executeMode;
        }

        public CreateDatasetRequestCreateCommandApiInfo setOsApiGroup(Integer osApiGroup) {
            this.osApiGroup = osApiGroup;
            return this;
        }
        public Integer getOsApiGroup() {
            return this.osApiGroup;
        }

        public CreateDatasetRequestCreateCommandApiInfo setOsProject(Integer osProject) {
            this.osProject = osProject;
            return this;
        }
        public Integer getOsProject() {
            return this.osProject;
        }

        public CreateDatasetRequestCreateCommandApiInfo setProtocol(Integer protocol) {
            this.protocol = protocol;
            return this;
        }
        public Integer getProtocol() {
            return this.protocol;
        }

        public CreateDatasetRequestCreateCommandApiInfo setRequestMethod(Integer requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Integer getRequestMethod() {
            return this.requestMethod;
        }

        public CreateDatasetRequestCreateCommandApiInfo setRequestParamList(java.util.List<CreateDatasetRequestCreateCommandApiInfoRequestParamList> requestParamList) {
            this.requestParamList = requestParamList;
            return this;
        }
        public java.util.List<CreateDatasetRequestCreateCommandApiInfoRequestParamList> getRequestParamList() {
            return this.requestParamList;
        }

        public CreateDatasetRequestCreateCommandApiInfo setResponseParamList(java.util.List<CreateDatasetRequestCreateCommandApiInfoResponseParamList> responseParamList) {
            this.responseParamList = responseParamList;
            return this;
        }
        public java.util.List<CreateDatasetRequestCreateCommandApiInfoResponseParamList> getResponseParamList() {
            return this.responseParamList;
        }

        public CreateDatasetRequestCreateCommandApiInfo setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig extends TeaModel {
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
         * <p>Test data source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The development path. This parameter is not required for basic projects.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML body extraction/test423/</p>
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
         * <p>HTML body extraction/test423/</p>
         */
        @NameInMap("ProdPath")
        public String prodPath;

        public static CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig self = new CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig setDevPath(String devPath) {
            this.devPath = devPath;
            return this;
        }
        public String getDevPath() {
            return this.devPath;
        }

        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig setProdPath(String prodPath) {
            this.prodPath = prodPath;
            return this;
        }
        public String getProdPath() {
            return this.prodPath;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
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
         * <p>The index building parameters. Specify different parameters based on the index type. For example, specify {M:30, efConstruction:360} for HNSW and {nlist:128} for IVF_FLAT.</p>
         * 
         * <strong>example:</strong>
         * <p>{M:30, efConstruction:360}</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>The index type. PostgreSQL supports IVFFlat and HNSW. Milvus supports all index types. Valid values: AUTOINDEX, FLAT, IVF_FLAT, IVF_SQ8, IVF_PQ, IVF_RABITQ, HNSW, HNSW_SQ, HNSW_PQ, HNSW_PRQ, DISKANN, SCANN, AISAQ, and IVFFlat.</p>
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

        public static CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig self = new CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns extends TeaModel {
        /**
         * <p>The column description.</p>
         * 
         * <strong>example:</strong>
         * <p>primary key</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The subtype of the array element. This parameter is valid only when the column type is ARRAY.</p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p>The maximum capacity of the array. This parameter is valid only when the column type is ARRAY. Default value: 4096.</p>
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
         * <p>Specifies whether the column is a primary key.</p>
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
         * <p>Specifies whether the column is a URL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        /**
         * <p>The vector index configuration. This configuration is applied when the column type is FLOAT_VECTOR, FLOAT16_VECTOR, or BFLOAT16_VECTOR to set the dimensions, index type, and similarity metric.</p>
         */
        @NameInMap("VectorIndexConfig")
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns self = new CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns setVectorIndexConfig(CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema extends TeaModel {
        /**
         * <p>The list of columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> columns;

        public static CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema self = new CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema setColumns(java.util.List<CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig extends TeaModel {
        /**
         * <p>The data source ID. The data source must match the metadata storage type.</p>
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
         * <p>Test data source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The development database or schema.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML body extraction/test423/</p>
         */
        @NameInMap("DevSchema")
        public String devSchema;

        /**
         * <p>The metadata storage mode. Valid values: CREATE (new table) and EXISTING (existing table).</p>
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
         * <p>The production database or schema.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTML body extraction/test423/</p>
         */
        @NameInMap("ProdSchema")
        public String prodSchema;

        /**
         * <p>The table name. Only lowercase letters, digits, and underscores (_) are allowed. The name must start with a lowercase letter and can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s_crm_all_plt_jala_shop</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The table schema.</p>
         */
        @NameInMap("TableSchema")
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema tableSchema;

        public static CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig self = new CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setDevSchema(String devSchema) {
            this.devSchema = devSchema;
            return this;
        }
        public String getDevSchema() {
            return this.devSchema;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setMetadataStorageMode(String metadataStorageMode) {
            this.metadataStorageMode = metadataStorageMode;
            return this;
        }
        public String getMetadataStorageMode() {
            return this.metadataStorageMode;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setProdSchema(String prodSchema) {
            this.prodSchema = prodSchema;
            return this;
        }
        public String getProdSchema() {
            return this.prodSchema;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig setTableSchema(CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig extends TeaModel {
        /**
         * <p>The embedding dimension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance:MySQL.monitor</p>
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
         * <p>The index building parameters. Specify different parameters based on the index type. For example, specify {M:30, efConstruction:360} for HNSW and {nlist:128} for IVF_FLAT.</p>
         * 
         * <strong>example:</strong>
         * <p>{M:30, efConstruction:360}</p>
         */
        @NameInMap("IndexParams")
        public java.util.Map<String, ?> indexParams;

        /**
         * <p>The index type. PostgreSQL supports IVFFlat and HNSW. Milvus supports all index types. Valid values: AUTOINDEX, FLAT, IVF_FLAT, IVF_SQ8, IVF_PQ, IVF_RABITQ, HNSW, HNSW_SQ, HNSW_PQ, HNSW_PRQ, DISKANN, SCANN, AISAQ, and IVFFlat.</p>
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

        public static CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig self = new CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setDimension(Long dimension) {
            this.dimension = dimension;
            return this;
        }
        public Long getDimension() {
            return this.dimension;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexParams(java.util.Map<String, ?> indexParams) {
            this.indexParams = indexParams;
            return this;
        }
        public java.util.Map<String, ?> getIndexParams() {
            return this.indexParams;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig setSimilarityType(String similarityType) {
            this.similarityType = similarityType;
            return this;
        }
        public String getSimilarityType() {
            return this.similarityType;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns extends TeaModel {
        /**
         * <p>The column description.</p>
         * 
         * <strong>example:</strong>
         * <p>happen time</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The subtype of the array element. This parameter is valid only when the column type is ARRAY.</p>
         * 
         * <strong>example:</strong>
         * <p>INT64</p>
         */
        @NameInMap("ElementType")
        public String elementType;

        /**
         * <p>The maximum capacity of the array. This parameter is valid only when the column type is ARRAY. Default value: 4096.</p>
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
         * <p>happen_time</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether the column is a primary key.</p>
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
         * <p>Specifies whether the column is a URL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Url")
        public Boolean url;

        /**
         * <p>The vector index configuration. Configure this parameter when the field type is FLOAT_VECTOR, FLOAT16_VECTOR, or BFLOAT16_VECTOR to specify the dimensions, index type, and similarity metric.</p>
         */
        @NameInMap("VectorIndexConfig")
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig;

        public static CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns self = new CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setElementType(String elementType) {
            this.elementType = elementType;
            return this;
        }
        public String getElementType() {
            return this.elementType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setPk(Boolean pk) {
            this.pk = pk;
            return this;
        }
        public Boolean getPk() {
            return this.pk;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setUrl(Boolean url) {
            this.url = url;
            return this;
        }
        public Boolean getUrl() {
            return this.url;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns setVectorIndexConfig(CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig vectorIndexConfig) {
            this.vectorIndexConfig = vectorIndexConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumnsVectorIndexConfig getVectorIndexConfig() {
            return this.vectorIndexConfig;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema extends TeaModel {
        /**
         * <p>The list of columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns;

        public static CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema self = new CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema setColumns(java.util.List<CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchemaColumns> getColumns() {
            return this.columns;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig extends TeaModel {
        /**
         * <p>The data source type of the meta table. Only KAFKA is supported in the current phase.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KAFKA</p>
         */
        @NameInMap("DatasourceType")
        public String datasourceType;

        /**
         * <p>The name of the meta table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test meta table</p>
         */
        @NameInMap("MetaTableName")
        public String metaTableName;

        /**
         * <p>The ID of the project to which the meta table belongs. Cross-project access is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7256391656294144</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The table schema.</p>
         */
        @NameInMap("TableSchema")
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema tableSchema;

        public static CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig self = new CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig setMetaTableName(String metaTableName) {
            this.metaTableName = metaTableName;
            return this;
        }
        public String getMetaTableName() {
            return this.metaTableName;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig setTableSchema(CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfigTableSchema getTableSchema() {
            return this.tableSchema;
        }

    }

    public static class CreateDatasetRequestCreateCommandVersionConfig extends TeaModel {
        /**
         * <p>The file storage configuration.</p>
         */
        @NameInMap("FileStorageConfig")
        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig fileStorageConfig;

        /**
         * <p>The metastore configuration.</p>
         */
        @NameInMap("MetadataStorageConfig")
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig metadataStorageConfig;

        /**
         * <p>The real-time meta table configuration. This configuration takes effect only when the metadata storage type is STREAM_TABLE.</p>
         */
        @NameInMap("RealtimeMetaTableConfig")
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig;

        /**
         * <p><strong>The version description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Test dataset version</p>
         */
        @NameInMap("VersionDescription")
        public String versionDescription;

        public static CreateDatasetRequestCreateCommandVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommandVersionConfig self = new CreateDatasetRequestCreateCommandVersionConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommandVersionConfig setFileStorageConfig(CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig fileStorageConfig) {
            this.fileStorageConfig = fileStorageConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigFileStorageConfig getFileStorageConfig() {
            return this.fileStorageConfig;
        }

        public CreateDatasetRequestCreateCommandVersionConfig setMetadataStorageConfig(CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig metadataStorageConfig) {
            this.metadataStorageConfig = metadataStorageConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigMetadataStorageConfig getMetadataStorageConfig() {
            return this.metadataStorageConfig;
        }

        public CreateDatasetRequestCreateCommandVersionConfig setRealtimeMetaTableConfig(CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig realtimeMetaTableConfig) {
            this.realtimeMetaTableConfig = realtimeMetaTableConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfigRealtimeMetaTableConfig getRealtimeMetaTableConfig() {
            return this.realtimeMetaTableConfig;
        }

        public CreateDatasetRequestCreateCommandVersionConfig setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class CreateDatasetRequestCreateCommand extends TeaModel {
        /**
         * <p>The API information for the online dataset.</p>
         */
        @NameInMap("ApiInfo")
        public CreateDatasetRequestCreateCommandApiInfo apiInfo;

        /**
         * <p>The content type of the dataset. Valid values: GENERAL, TEXT, AUDIO, VIDEO, IMAGE, TABLE, and INDEX.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p><strong>The subject domain ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>78201</p>
         */
        @NameInMap("DataCellId")
        public String dataCellId;

        /**
         * <p><strong>The description.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Test dataset</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p><strong>The directory (obtained from the file service by using the file ID).</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("DirName")
        public String dirName;

        /**
         * <p><strong>The file ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>7255018404650688</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The metastore type.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTGRESQL</p>
         */
        @NameInMap("MetadataStorageType")
        public String metadataStorageType;

        /**
         * <p>The name of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of owner IDs. Separate multiple IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The Scenarios in which the dataset is used. Valid values: OFFLINE (offline, default) and REALTIME (real-time).</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the dataset. Valid values: FILE, TABLE, and HYBRID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number. If you do not specify this parameter, the default version V1 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The version configuration.</p>
         */
        @NameInMap("VersionConfig")
        public CreateDatasetRequestCreateCommandVersionConfig versionConfig;

        public static CreateDatasetRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestCreateCommand self = new CreateDatasetRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestCreateCommand setApiInfo(CreateDatasetRequestCreateCommandApiInfo apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public CreateDatasetRequestCreateCommandApiInfo getApiInfo() {
            return this.apiInfo;
        }

        public CreateDatasetRequestCreateCommand setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateDatasetRequestCreateCommand setDataCellId(String dataCellId) {
            this.dataCellId = dataCellId;
            return this;
        }
        public String getDataCellId() {
            return this.dataCellId;
        }

        public CreateDatasetRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDatasetRequestCreateCommand setDirName(String dirName) {
            this.dirName = dirName;
            return this;
        }
        public String getDirName() {
            return this.dirName;
        }

        public CreateDatasetRequestCreateCommand setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateDatasetRequestCreateCommand setMetadataStorageType(String metadataStorageType) {
            this.metadataStorageType = metadataStorageType;
            return this;
        }
        public String getMetadataStorageType() {
            return this.metadataStorageType;
        }

        public CreateDatasetRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDatasetRequestCreateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public CreateDatasetRequestCreateCommand setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public CreateDatasetRequestCreateCommand setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public CreateDatasetRequestCreateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDatasetRequestCreateCommand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateDatasetRequestCreateCommand setVersionConfig(CreateDatasetRequestCreateCommandVersionConfig versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public CreateDatasetRequestCreateCommandVersionConfig getVersionConfig() {
            return this.versionConfig;
        }

    }

}
