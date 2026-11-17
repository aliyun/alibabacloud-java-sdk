// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectResponseBody extends TeaModel {
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
    public CreateKnowledgeObjectResponseBodyData data;

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

    public static CreateKnowledgeObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectResponseBody self = new CreateKnowledgeObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeObjectResponseBody setData(CreateKnowledgeObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKnowledgeObjectResponseBodyData getData() {
        return this.data;
    }

    public CreateKnowledgeObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeObjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKnowledgeObjectResponseBodyDataContentDocument extends TeaModel {
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

        public static CreateKnowledgeObjectResponseBodyDataContentDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentDocument self = new CreateKnowledgeObjectResponseBodyDataContentDocument();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public CreateKnowledgeObjectResponseBodyDataContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields extends TeaModel {
        /**
         * <p>The data type of the field. This must be provided for publicly available model fields and is not guessed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The description. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user-facing name. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets extends TeaModel {
        /**
         * <p>The description. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as-is without concatenating it.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The defined and publicly available fields of the dataset. If no field definitions are provided, this is an empty array.</p>
         */
        @NameInMap("Fields")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields;

        /**
         * <p>The user-facing name. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared primary key field name. This parameter is optional. Each item must exist in the Fields of this dataset.</p>
         */
        @NameInMap("PrimaryKey")
        public java.util.List<String> primaryKey;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setFields(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects extends TeaModel {
        /**
         * <p>The SQL dialect, such as MaxCompute or ANSI_SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Dialect")
        public String dialect;

        /**
         * <p>The non-empty calculation expression in the specified dialect. It is not a complete query statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM(pay_amount)</p>
         */
        @NameInMap("Sql")
        public String sql;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions of the same metric in different SQL dialects. At least one item is required. The same dialect is not repeated.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression setDialects(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics extends TeaModel {
        /**
         * <p>The SemanticDataset.Name to which the metric belongs. It must be locatable in the Datasets of this model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The description. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The executable expression. It must include at least one dialect version and is not auto-completed by the model.</p>
         */
        @NameInMap("Expression")
        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression;

        /**
         * <p>The user-facing name. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared unit of the metric. This parameter is optional. It is not returned when no reliable source is available.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setExpression(CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys extends TeaModel {
        /**
         * <p>The name of the field in the starting dataset that participates in the relationship. It must be defined in the Fields of the dataset corresponding to FromDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("FromField")
        public String fromField;

        /**
         * <p>The name of the field in the ending dataset that participates in the relationship. It must be defined in the Fields of the dataset corresponding to ToDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ToField")
        public String toField;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships extends TeaModel {
        /**
         * <p>The SemanticDataset.Name of the starting point.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("FromDataset")
        public String fromDataset;

        /**
         * <p>The equi-join pairs of fields at both ends of the relationship. For composite relationships, fields are paired item by item.</p>
         */
        @NameInMap("JoinKeys")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys;

        /**
         * <p>The user-facing name. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The SemanticDataset.Name of the ending point.</p>
         * 
         * <strong>example:</strong>
         * <p>customers</p>
         */
        @NameInMap("ToDataset")
        public String toDataset;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setJoinKeys(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets included in the model. An empty array is returned if no public datasets are available.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. If no metrics exist, this is an empty array. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships in the model expressed by field pairs. If no relationships exist, this is an empty array. Relationships are not guessed from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships;

        public static CreateKnowledgeObjectResponseBodyDataContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContentSemanticModel self = new CreateKnowledgeObjectResponseBodyDataContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModel setDatasets(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModel setMetrics(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public CreateKnowledgeObjectResponseBodyDataContentSemanticModel setRelationships(java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataContent extends TeaModel {
        /**
         * <p>This operation returns only the document content.</p>
         */
        @NameInMap("Document")
        public CreateKnowledgeObjectResponseBodyDataContentDocument document;

        /**
         * <p>The semantic model. This field exists only when Type is set to SEMANTIC_MODEL.</p>
         */
        @NameInMap("SemanticModel")
        public CreateKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel;

        public static CreateKnowledgeObjectResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataContent self = new CreateKnowledgeObjectResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataContent setDocument(CreateKnowledgeObjectResponseBodyDataContentDocument document) {
            this.document = document;
            return this;
        }
        public CreateKnowledgeObjectResponseBodyDataContentDocument getDocument() {
            return this.document;
        }

        public CreateKnowledgeObjectResponseBodyDataContent setSemanticModel(CreateKnowledgeObjectResponseBodyDataContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public CreateKnowledgeObjectResponseBodyDataContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataDownloadFiles extends TeaModel {
        /**
         * <p>The temporary download URL for the specification YAML file. The validity period is specified by ExpiresIn.</p>
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
         * <p>Business_Description.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static CreateKnowledgeObjectResponseBodyDataDownloadFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataDownloadFiles self = new CreateKnowledgeObjectResponseBodyDataDownloadFiles();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataDownloadFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateKnowledgeObjectResponseBodyDataDownloadFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyDataSourceReferences extends TeaModel {
        /**
         * <p>The source ID. This field exists only when the type is KNOWLEDGE_SOURCE. It represents the SourceId of the KnowledgeSource registered in the current knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>src-001</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The category of the source reference. The structure retains KNOWLEDGE_SOURCE. Currently, SourceReferences is an empty array.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCUMENT</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateKnowledgeObjectResponseBodyDataSourceReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyDataSourceReferences self = new CreateKnowledgeObjectResponseBodyDataSourceReferences();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyDataSourceReferences setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public CreateKnowledgeObjectResponseBodyDataSourceReferences setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateKnowledgeObjectResponseBodyData extends TeaModel {
        /**
         * <p>The current valid typed knowledge content. Returns the document or semantic model structure based on the Type.</p>
         */
        @NameInMap("Content")
        public CreateKnowledgeObjectResponseBodyDataContent content;

        /**
         * <p>The time when the object was first created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The download items for multi-file specification YAMLs, including file names and temporary download URLs.</p>
         */
        @NameInMap("DownloadFiles")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles;

        /**
         * <p>The temporary download URL for the original uploaded file of the DOCUMENT or the current specification YAML of the SEMANTIC_MODEL returned by GetKnowledgeObject. This is not a persistent property.</p>
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
         * <p>The validity period of the download URL, in seconds. This field is returned together with DownloadUrl.</p>
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
         * <p>Business_Description.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The ID of the knowledge base to which the object belongs.</p>
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
         * <p>obj-document-001</p>
         */
        @NameInMap("KnowledgeObjectId")
        public String knowledgeObjectId;

        /**
         * <p>The time when the object was last modified, in milliseconds. This value is used for conditional updates of the DOCUMENT body. This field does not indicate that optimistic locking updates are supported for semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user-facing name. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the uploaded original file in bytes. This field is read-only and does not represent the length of the edited body.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The array of source references. Currently, an empty array is returned.</p>
         */
        @NameInMap("SourceReferences")
        public java.util.List<CreateKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences;

        /**
         * <p>The object type. The value is fixed to DOCUMENT.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCUMENT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The current version of the SEMANTIC_MODEL being read. Pass this value when updating the content to edit the version in place.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static CreateKnowledgeObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectResponseBodyData self = new CreateKnowledgeObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectResponseBodyData setContent(CreateKnowledgeObjectResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public CreateKnowledgeObjectResponseBodyDataContent getContent() {
            return this.content;
        }

        public CreateKnowledgeObjectResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateKnowledgeObjectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectResponseBodyData setDownloadFiles(java.util.List<CreateKnowledgeObjectResponseBodyDataDownloadFiles> downloadFiles) {
            this.downloadFiles = downloadFiles;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataDownloadFiles> getDownloadFiles() {
            return this.downloadFiles;
        }

        public CreateKnowledgeObjectResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateKnowledgeObjectResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public CreateKnowledgeObjectResponseBodyData setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public CreateKnowledgeObjectResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateKnowledgeObjectResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public CreateKnowledgeObjectResponseBodyData setKnowledgeObjectId(String knowledgeObjectId) {
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }
        public String getKnowledgeObjectId() {
            return this.knowledgeObjectId;
        }

        public CreateKnowledgeObjectResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateKnowledgeObjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectResponseBodyData setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public CreateKnowledgeObjectResponseBodyData setSourceReferences(java.util.List<CreateKnowledgeObjectResponseBodyDataSourceReferences> sourceReferences) {
            this.sourceReferences = sourceReferences;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectResponseBodyDataSourceReferences> getSourceReferences() {
            return this.sourceReferences;
        }

        public CreateKnowledgeObjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateKnowledgeObjectResponseBodyData setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

}
