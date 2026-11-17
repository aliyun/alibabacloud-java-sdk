// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeObjectResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when a request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public GetKnowledgeObjectResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKnowledgeObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeObjectResponseBody self = new GetKnowledgeObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeObjectResponseBody setData(GetKnowledgeObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeObjectResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeObjectResponseBodyDataContentDocument extends TeaModel {
        /**
         * <p>The content format. This field is required when Text is provided. Initially, the supported values are MARKDOWN and TEXT.</p>
         * 
         * <strong>example:</strong>
         * <p>MARKDOWN</p>
         */
        @NameInMap("ContentFormat")
        public String contentFormat;

        /**
         * <p>The current document body that can be provided to the caller. This field is optional. It is omitted if parsing is incomplete, access is not authorized, or the full document cannot be provided securely. A single retrieved snippet does not stand in for the entire document.</p>
         * 
         * <strong>example:</strong>
         * <p>Updated full text</p>
         */
        @NameInMap("Text")
        public String text;

        public static GetKnowledgeObjectResponseBodyDataContentDocument build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentDocument self = new GetKnowledgeObjectResponseBodyDataContentDocument();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public GetKnowledgeObjectResponseBodyDataContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields extends TeaModel {
        /**
         * <p>The data type of the field. This field is required for publicly accessible model fields and is not inferred by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The business description of the field. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual payment amount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets extends TeaModel {
        /**
         * <p>The business description of the dataset. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual payment amount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The DataWorks Data Map table entity ID. This field is returned when a reliable association exists. If the ID is omitted for an existing dataset of the same name, the existing ID is retained. Submitted values are processed according to the semantic layer rules for saving data.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The defined and publicly accessible fields of the dataset. An empty array is returned if no field definitions are provided.</p>
         */
        @NameInMap("Fields")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields;

        /**
         * <p>The name of the dataset within the model. This name is used to locate relationships within the model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared primary key field names. This field is optional. Each field must exist in the Fields array of the dataset.</p>
         */
        @NameInMap("PrimaryKey")
        public java.util.List<String> primaryKey;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setFields(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects extends TeaModel {
        /**
         * <p>The SQL dialect, such as MaxCompute or ANSI_SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Dialect")
        public String dialect;

        /**
         * <p>The non-empty calculation expression in the specified dialect. This is not a complete query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM(pay_amount)</p>
         */
        @NameInMap("Sql")
        public String sql;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions of the metric in different SQL dialects. At least one item is required. Duplicate dialects are not allowed.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression setDialects(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics extends TeaModel {
        /**
         * <p>The name of the dataset to which the metric belongs. This name must match a dataset in the Datasets array of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The definition of the metric. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales order analysis model</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The executable expression. This field must contain at least one dialect version and is not auto-generated by the model.</p>
         */
        @NameInMap("Expression")
        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales amount</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared unit of the metric. This field is optional and is not returned if no reliable source is available.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setExpression(GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys extends TeaModel {
        /**
         * <p>The field name in FromDataset.Fields.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("FromField")
        public String fromField;

        /**
         * <p>The field name in ToDataset.Fields.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ToField")
        public String toField;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships extends TeaModel {
        /**
         * <p>The name of the source dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("FromDataset")
        public String fromDataset;

        /**
         * <p>The equi-join key pairs for the fields at both ends. At least one pair is required. Composite joins are listed as individual pairs.</p>
         */
        @NameInMap("JoinKeys")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys;

        /**
         * <p>The name of the relationship within the model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders_to_customers</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the target dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>customers</p>
         */
        @NameInMap("ToDataset")
        public String toDataset;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships self = new GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setJoinKeys(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets included in the model. An empty array is returned if no public datasets are available.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. An empty array is returned if no metrics are available. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships expressed by field pairs in the model. An empty array is returned if no relationships are defined. Relationships are not inferred from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships;

        public static GetKnowledgeObjectResponseBodyDataContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContentSemanticModel self = new GetKnowledgeObjectResponseBodyDataContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModel setDatasets(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModel setMetrics(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public GetKnowledgeObjectResponseBodyDataContentSemanticModel setRelationships(java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataContent extends TeaModel {
        /**
         * <p>The document content. This field is present only when the type is DOCUMENT.</p>
         */
        @NameInMap("Document")
        public GetKnowledgeObjectResponseBodyDataContentDocument document;

        /**
         * <p>The semantic model content. This field is present only when the type is SEMANTIC_MODEL.</p>
         */
        @NameInMap("SemanticModel")
        public GetKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel;

        public static GetKnowledgeObjectResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataContent self = new GetKnowledgeObjectResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataContent setDocument(GetKnowledgeObjectResponseBodyDataContentDocument document) {
            this.document = document;
            return this;
        }
        public GetKnowledgeObjectResponseBodyDataContentDocument getDocument() {
            return this.document;
        }

        public GetKnowledgeObjectResponseBodyDataContent setSemanticModel(GetKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public GetKnowledgeObjectResponseBodyDataContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataDownloadFiles extends TeaModel {
        /**
         * <p>The temporary HTTPS download URL of the shard. The validity period is specified by the ExpiresIn field.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/current-model-yaml">https://example.invalid/current-model-yaml</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The file name of the specification YAML shard. Multiple shards form the complete model and do not represent the object identity.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static GetKnowledgeObjectResponseBodyDataDownloadFiles build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataDownloadFiles self = new GetKnowledgeObjectResponseBodyDataDownloadFiles();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataDownloadFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetKnowledgeObjectResponseBodyDataDownloadFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetKnowledgeObjectResponseBodyDataSourceReferences extends TeaModel {
        /**
         * <p>The source ID registered in the knowledge base. This field is present only when the type is KNOWLEDGE_SOURCE.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The type of the source reference. The structure reserves KNOWLEDGE_SOURCE. Currently, the SourceReferences array is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SEMANTIC_MODEL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetKnowledgeObjectResponseBodyDataSourceReferences build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyDataSourceReferences self = new GetKnowledgeObjectResponseBodyDataSourceReferences();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyDataSourceReferences setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetKnowledgeObjectResponseBodyDataSourceReferences setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetKnowledgeObjectResponseBodyData extends TeaModel {
        /**
         * <p>The current valid typed knowledge content. The structure returned is a document or semantic model based on the object type.</p>
         */
        @NameInMap("Content")
        public GetKnowledgeObjectResponseBodyDataContent content;

        /**
         * <p>The time when the object was first created. This field is not returned for existing objects whose creation time cannot be reliably determined.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The brief description of the object. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales order analysis model</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The complete shards returned for multi-file specification snapshots. Each item contains a FileName and a DownloadUrl. For single-file snapshots, use the DownloadUrl field.</p>
         */
        @NameInMap("DownloadFiles")
        public java.util.List<GetKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles;

        /**
         * <p>The temporary download URL of the uploaded original file for documents. For semantic models, this is the temporary download URL of the complete specification YAML for the current version.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/current-model-yaml">https://example.invalid/current-model-yaml</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>Indicates whether the current caller has full content editing permissions. The value is true for OWNER and ADMIN and false for VIEWER. Authorization is checked again for write operations.</p>
         */
        @NameInMap("Editable")
        public Boolean editable;

        /**
         * <p>The validity period of the download URL, in seconds. The value is fixed at 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ExpiresIn")
        public Integer expiresIn;

        /**
         * <p>The original file name of the uploaded document. This field is read-only. Renaming the object does not change this value. This field is not returned for external documents and semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The ID of the knowledge object. For semantic models, use the model ID from the semantic layer. For documents, use the stable ID from the local document table. Callers must treat the ID as opaque and must not use a retrieval ID in its place.</p>
         * 
         * <strong>example:</strong>
         * <p>obj-001</p>
         */
        @NameInMap("KnowledgeObjectId")
        public String knowledgeObjectId;

        /**
         * <p>The time when the object was last modified, in milliseconds. This value is used for conditional updates of the document body. This field does not indicate that the semantic model supports optimistic locking.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the knowledge object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales subject model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the uploaded original file in bytes. This field is read-only and does not reflect the length of the edited text.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The array of source references. An empty array is currently returned.</p>
         */
        @NameInMap("SourceReferences")
        public java.util.List<GetKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences;

        /**
         * <p>The object type. Current valid values are SEMANTIC_MODEL and DOCUMENT. This field may be extended in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>SEMANTIC_MODEL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the semantic model read in this request. This version is used to specify the target version for subsequent saves and is not an optimistic lock.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static GetKnowledgeObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeObjectResponseBodyData self = new GetKnowledgeObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeObjectResponseBodyData setContent(GetKnowledgeObjectResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public GetKnowledgeObjectResponseBodyDataContent getContent() {
            return this.content;
        }

        public GetKnowledgeObjectResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeObjectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetKnowledgeObjectResponseBodyData setDownloadFiles(java.util.List<GetKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles) {
            this.downloadFiles = downloadFiles;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataDownloadFiles> getDownloadFiles() {
            return this.downloadFiles;
        }

        public GetKnowledgeObjectResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetKnowledgeObjectResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public GetKnowledgeObjectResponseBodyData setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public GetKnowledgeObjectResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetKnowledgeObjectResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgeObjectResponseBodyData setKnowledgeObjectId(String knowledgeObjectId) {
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }
        public String getKnowledgeObjectId() {
            return this.knowledgeObjectId;
        }

        public GetKnowledgeObjectResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetKnowledgeObjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetKnowledgeObjectResponseBodyData setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public GetKnowledgeObjectResponseBodyData setSourceReferences(java.util.List<GetKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences) {
            this.sourceReferences = sourceReferences;
            return this;
        }
        public java.util.List<GetKnowledgeObjectResponseBodyDataSourceReferences> getSourceReferences() {
            return this.sourceReferences;
        }

        public GetKnowledgeObjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetKnowledgeObjectResponseBodyData setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

}
