// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeObjectResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when the request fails.</p>
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
    public UpdateKnowledgeObjectResponseBodyData data;

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

    public static UpdateKnowledgeObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeObjectResponseBody self = new UpdateKnowledgeObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateKnowledgeObjectResponseBody setData(UpdateKnowledgeObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateKnowledgeObjectResponseBodyData getData() {
        return this.data;
    }

    public UpdateKnowledgeObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateKnowledgeObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentDocument extends TeaModel {
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
         * <p>Updated full body text</p>
         */
        @NameInMap("Text")
        public String text;

        public static UpdateKnowledgeObjectResponseBodyDataContentDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentDocument self = new UpdateKnowledgeObjectResponseBodyDataContentDocument();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields extends TeaModel {
        /**
         * <p>The data type of the field. This parameter is required for publicly available model fields and is not inferred by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>DECIMAL</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The business description of the field. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual paid amount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_amount</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets extends TeaModel {
        /**
         * <p>The business description of the dataset. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual paid amount</p>
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
         * <p>The defined and publicly available fields of the dataset. This is an empty array if no field definitions are provided.</p>
         */
        @NameInMap("Fields")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields;

        /**
         * <p>The name of the dataset within the model, used for relationship positioning within the model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared primary key field name. This parameter is optional. Each item must exist in the Fields of this dataset.</p>
         */
        @NameInMap("PrimaryKey")
        public java.util.List<String> primaryKey;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setFields(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects extends TeaModel {
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
         * <p>SUM(pay_amount - refund_amount)</p>
         */
        @NameInMap("Sql")
        public String sql;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions for the same metric in different SQL dialects. At least one item is required. Dialects cannot be duplicated.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression setDialects(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics extends TeaModel {
        /**
         * <p>The name of the associated SemanticDataset. This must be locatable within the Datasets of this model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The description of the metric calculation logic. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual paid amount minus refund amount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The executable expression. This must include at least one dialect version and is not auto-generated by the model.</p>
         */
        @NameInMap("Expression")
        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>Net sales</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared unit of the metric. This parameter is optional and is not returned if no reliable source is available.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setExpression(UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys extends TeaModel {
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

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships extends TeaModel {
        /**
         * <p>The name of the source SemanticDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("FromDataset")
        public String fromDataset;

        /**
         * <p>The equi-join key pairs for the fields at both ends. At least one item is required. Composite joins are listed item by item.</p>
         */
        @NameInMap("JoinKeys")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys;

        /**
         * <p>The name of the relationship within the model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the target SemanticDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>customers</p>
         */
        @NameInMap("ToDataset")
        public String toDataset;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setJoinKeys(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets included in the model. An empty array is returned if no public datasets are available.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. This is an empty array if no metrics are available. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships in the model expressed by field pairs. This is an empty array if no relationships are available. Relationships are not inferred from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships;

        public static UpdateKnowledgeObjectResponseBodyDataContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContentSemanticModel self = new UpdateKnowledgeObjectResponseBodyDataContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModel setDatasets(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModel setMetrics(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModel setRelationships(java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataContent extends TeaModel {
        /**
         * <p>The document content. This property exists only when Type is set to DOCUMENT.</p>
         */
        @NameInMap("Document")
        public UpdateKnowledgeObjectResponseBodyDataContentDocument document;

        /**
         * <p>The semantic model content. This property exists only when Type is set to SEMANTIC_MODEL.</p>
         */
        @NameInMap("SemanticModel")
        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel;

        public static UpdateKnowledgeObjectResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataContent self = new UpdateKnowledgeObjectResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataContent setDocument(UpdateKnowledgeObjectResponseBodyDataContentDocument document) {
            this.document = document;
            return this;
        }
        public UpdateKnowledgeObjectResponseBodyDataContentDocument getDocument() {
            return this.document;
        }

        public UpdateKnowledgeObjectResponseBodyDataContent setSemanticModel(UpdateKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public UpdateKnowledgeObjectResponseBodyDataContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataDownloadFiles extends TeaModel {
        /**
         * <p>The temporary download URL for the single-file YAML specification. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The original file name of the uploaded document. This field is read-only. Renaming the object does not change this value. This field is not returned for external documents and semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static UpdateKnowledgeObjectResponseBodyDataDownloadFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataDownloadFiles self = new UpdateKnowledgeObjectResponseBodyDataDownloadFiles();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataDownloadFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public UpdateKnowledgeObjectResponseBodyDataDownloadFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyDataSourceReferences extends TeaModel {
        /**
         * <p>The source ID of the registered KnowledgeSource in the current knowledge base. This field exists only when the type is KNOWLEDGE_SOURCE.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The category of the source reference. The structure retains KNOWLEDGE_SOURCE. The SourceReferences array is currently empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SEMANTIC_MODEL</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeObjectResponseBodyDataSourceReferences build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyDataSourceReferences self = new UpdateKnowledgeObjectResponseBodyDataSourceReferences();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyDataSourceReferences setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public UpdateKnowledgeObjectResponseBodyDataSourceReferences setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateKnowledgeObjectResponseBodyData extends TeaModel {
        /**
         * <p>The current valid typed knowledge content. The document or semantic model structure is returned based on the type.</p>
         */
        @NameInMap("Content")
        public UpdateKnowledgeObjectResponseBodyDataContent content;

        /**
         * <p>The time when the object was first created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the knowledge object. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Actual paid amount</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The complete specification shards for multi-file models. Each item includes FileName and DownloadUrl. This field is optional.</p>
         */
        @NameInMap("DownloadFiles")
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles;

        /**
         * <p>The temporary download URL for the single-file YAML specification. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>Indicates whether the current caller has full content editing permissions. The value is true for OWNER and ADMIN and false for VIEWER. Authorization is checked again for write operations.</p>
         */
        @NameInMap("Editable")
        public Boolean editable;

        /**
         * <p>The validity period of the download URL, in seconds. This field is optional.</p>
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
         * <p>The ID of the associated knowledge base.</p>
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
         * <p>obj-model-001</p>
         */
        @NameInMap("KnowledgeObjectId")
        public String knowledgeObjectId;

        /**
         * <p>The time when the object was last modified, in milliseconds. This value is used for conditional updates of DOCUMENT content. This field does not indicate that optimistic locking updates are supported for semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>1791789000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user-facing name of the knowledge object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the original uploaded file in bytes. This field is read-only and does not represent the length of the edited content.</p>
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
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences;

        /**
         * <p>The knowledge object type. The current values are SEMANTIC_MODEL and DOCUMENT. More types may be added in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>SEMANTIC_MODEL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the model that is saved and read in the current operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static UpdateKnowledgeObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectResponseBodyData self = new UpdateKnowledgeObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectResponseBodyData setContent(UpdateKnowledgeObjectResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public UpdateKnowledgeObjectResponseBodyDataContent getContent() {
            return this.content;
        }

        public UpdateKnowledgeObjectResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateKnowledgeObjectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectResponseBodyData setDownloadFiles(java.util.List<UpdateKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles) {
            this.downloadFiles = downloadFiles;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataDownloadFiles> getDownloadFiles() {
            return this.downloadFiles;
        }

        public UpdateKnowledgeObjectResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public UpdateKnowledgeObjectResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public UpdateKnowledgeObjectResponseBodyData setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public UpdateKnowledgeObjectResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public UpdateKnowledgeObjectResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public UpdateKnowledgeObjectResponseBodyData setKnowledgeObjectId(String knowledgeObjectId) {
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }
        public String getKnowledgeObjectId() {
            return this.knowledgeObjectId;
        }

        public UpdateKnowledgeObjectResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public UpdateKnowledgeObjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectResponseBodyData setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public UpdateKnowledgeObjectResponseBodyData setSourceReferences(java.util.List<UpdateKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences) {
            this.sourceReferences = sourceReferences;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectResponseBodyDataSourceReferences> getSourceReferences() {
            return this.sourceReferences;
        }

        public UpdateKnowledgeObjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateKnowledgeObjectResponseBodyData setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

}
