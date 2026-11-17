// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectRequest extends TeaModel {
    /**
     * <p>The idempotency token for the creation request. Keep the original request unchanged when retrying.</p>
     * 
     * <strong>example:</strong>
     * <p>create-document-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Only Content.Document is supported. It includes Text and ContentFormat (MARKDOWN or TEXT).</p>
     */
    @NameInMap("Content")
    public CreateKnowledgeObjectRequestContent content;

    /**
     * <p>The document description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy document</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the target knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The document name. Existing objects are not overwritten based on the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business description</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the object. For this operation, the value is fixed to DOCUMENT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCUMENT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the completed PUT upload session for this knowledge base. This parameter is mutually exclusive with Content.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abd</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    public static CreateKnowledgeObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectRequest self = new CreateKnowledgeObjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeObjectRequest setContent(CreateKnowledgeObjectRequestContent content) {
        this.content = content;
        return this;
    }
    public CreateKnowledgeObjectRequestContent getContent() {
        return this.content;
    }

    public CreateKnowledgeObjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeObjectRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeObjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeObjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateKnowledgeObjectRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public static class CreateKnowledgeObjectRequestContentDocument extends TeaModel {
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

        public static CreateKnowledgeObjectRequestContentDocument build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentDocument self = new CreateKnowledgeObjectRequestContentDocument();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public CreateKnowledgeObjectRequestContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields extends TeaModel {
        /**
         * <p>The data type of the field. This must be provided for publicly available model fields and is not guessed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The document description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The document name. Existing objects are not overwritten based on the name.</p>
         * 
         * <strong>example:</strong>
         * <p>Business description</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields self = new CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelDatasets extends TeaModel {
        /**
         * <p>The document description.</p>
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
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields> fields;

        /**
         * <p>The document name. Existing objects are not overwritten based on the name.</p>
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

        public static CreateKnowledgeObjectRequestContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelDatasets self = new CreateKnowledgeObjectRequestContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasets setFields(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects extends TeaModel {
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

        public static CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects self = new CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions of the same metric in different SQL dialects. At least one item is required. The same dialect is not repeated.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> dialects;

        public static CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression self = new CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression setDialects(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelMetrics extends TeaModel {
        /**
         * <p>The SemanticDataset.Name to which the metric belongs. It must be locatable in the Datasets of this model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The document description.</p>
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
        public CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression expression;

        /**
         * <p>The document name. Existing objects are not overwritten based on the name.</p>
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

        public static CreateKnowledgeObjectRequestContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelMetrics self = new CreateKnowledgeObjectRequestContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetrics setExpression(CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public CreateKnowledgeObjectRequestContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys extends TeaModel {
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

        public static CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys self = new CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModelRelationships extends TeaModel {
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
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> joinKeys;

        /**
         * <p>The document name. Existing objects are not overwritten based on the name.</p>
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

        public static CreateKnowledgeObjectRequestContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModelRelationships self = new CreateKnowledgeObjectRequestContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationships setJoinKeys(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeObjectRequestContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class CreateKnowledgeObjectRequestContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets included in the model. If no public datasets exist, this is an empty array.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. If no metrics exist, this is an empty array. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships in the model expressed by field pairs. If no relationships exist, this is an empty array. Relationships are not guessed from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationships> relationships;

        public static CreateKnowledgeObjectRequestContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContentSemanticModel self = new CreateKnowledgeObjectRequestContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContentSemanticModel setDatasets(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public CreateKnowledgeObjectRequestContentSemanticModel setMetrics(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public CreateKnowledgeObjectRequestContentSemanticModel setRelationships(java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<CreateKnowledgeObjectRequestContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class CreateKnowledgeObjectRequestContent extends TeaModel {
        /**
         * <p>This operation returns only the document content.</p>
         */
        @NameInMap("Document")
        public CreateKnowledgeObjectRequestContentDocument document;

        /**
         * <p>This operation does not accept this branch. Use a build task to import YAML for new semantic models.</p>
         */
        @NameInMap("SemanticModel")
        public CreateKnowledgeObjectRequestContentSemanticModel semanticModel;

        public static CreateKnowledgeObjectRequestContent build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectRequestContent self = new CreateKnowledgeObjectRequestContent();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectRequestContent setDocument(CreateKnowledgeObjectRequestContentDocument document) {
            this.document = document;
            return this;
        }
        public CreateKnowledgeObjectRequestContentDocument getDocument() {
            return this.document;
        }

        public CreateKnowledgeObjectRequestContent setSemanticModel(CreateKnowledgeObjectRequestContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public CreateKnowledgeObjectRequestContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

}
