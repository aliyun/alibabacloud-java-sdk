// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeObjectRequest extends TeaModel {
    /**
     * <p>The client token. This parameter is supported only for DOCUMENT. Model updates do not guarantee exactly-once remote save notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>edit-document-text-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The typed content update. Object properties are submitted as needed. Arrays are replaced in their entirety when submitted. Unspecified properties are retained.</p>
     */
    @NameInMap("Content")
    public UpdateKnowledgeObjectRequestContent content;

    /**
     * <p>The new description. An empty string clears the description. If this parameter is not specified, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>Actual paid amount</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected modification time. This parameter is supported only for DOCUMENT. It is required when modifying the body text and optional when modifying metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>1790200800000</p>
     */
    @NameInMap("ExpectedModifyTime")
    public Long expectedModifyTime;

    /**
     * <p>The ID of the knowledge base to which the object belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The stable knowledge object ID returned by the Get or List operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>obj-model-001</p>
     */
    @NameInMap("KnowledgeObjectId")
    public String knowledgeObjectId;

    /**
     * <p>The new name. This parameter cannot be empty. If this parameter is not specified, the original value is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The upload ID. This parameter is supported only for SEMANTIC_MODEL. It replaces the public model content with a complete YAML file and is mutually exclusive with Content.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abd</p>
     */
    @NameInMap("UploadId")
    public String uploadId;

    /**
     * <p>The version number. This parameter is required when updating Content or UploadId for SEMANTIC_MODEL. Use the VersionNo returned by the Get operation. This is not an optimistic lock.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionNo")
    public Long versionNo;

    public static UpdateKnowledgeObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeObjectRequest self = new UpdateKnowledgeObjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeObjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKnowledgeObjectRequest setContent(UpdateKnowledgeObjectRequestContent content) {
        this.content = content;
        return this;
    }
    public UpdateKnowledgeObjectRequestContent getContent() {
        return this.content;
    }

    public UpdateKnowledgeObjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeObjectRequest setExpectedModifyTime(Long expectedModifyTime) {
        this.expectedModifyTime = expectedModifyTime;
        return this;
    }
    public Long getExpectedModifyTime() {
        return this.expectedModifyTime;
    }

    public UpdateKnowledgeObjectRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeObjectRequest setKnowledgeObjectId(String knowledgeObjectId) {
        this.knowledgeObjectId = knowledgeObjectId;
        return this;
    }
    public String getKnowledgeObjectId() {
        return this.knowledgeObjectId;
    }

    public UpdateKnowledgeObjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeObjectRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public UpdateKnowledgeObjectRequest setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public Long getVersionNo() {
        return this.versionNo;
    }

    public static class UpdateKnowledgeObjectRequestContentDocument extends TeaModel {
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

        public static UpdateKnowledgeObjectRequestContentDocument build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentDocument self = new UpdateKnowledgeObjectRequestContentDocument();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public UpdateKnowledgeObjectRequestContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields extends TeaModel {
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

        public static UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields self = new UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelDatasets extends TeaModel {
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
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields> fields;

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

        public static UpdateKnowledgeObjectRequestContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelDatasets self = new UpdateKnowledgeObjectRequestContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasets setFields(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects extends TeaModel {
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

        public static UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects self = new UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions for the same metric in different SQL dialects. At least one item is required. Dialects cannot be duplicated.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> dialects;

        public static UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression self = new UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression setDialects(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelMetrics extends TeaModel {
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
        public UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression expression;

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

        public static UpdateKnowledgeObjectRequestContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelMetrics self = new UpdateKnowledgeObjectRequestContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetrics setExpression(UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public UpdateKnowledgeObjectRequestContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys extends TeaModel {
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

        public static UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys self = new UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModelRelationships extends TeaModel {
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
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> joinKeys;

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

        public static UpdateKnowledgeObjectRequestContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModelRelationships self = new UpdateKnowledgeObjectRequestContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationships setJoinKeys(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class UpdateKnowledgeObjectRequestContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets contained in the model. This is an empty array if no public datasets are available.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. This is an empty array if no metrics are available. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships in the model expressed by field pairs. This is an empty array if no relationships are available. Relationships are not inferred from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationships> relationships;

        public static UpdateKnowledgeObjectRequestContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContentSemanticModel self = new UpdateKnowledgeObjectRequestContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContentSemanticModel setDatasets(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModel setMetrics(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public UpdateKnowledgeObjectRequestContentSemanticModel setRelationships(java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<UpdateKnowledgeObjectRequestContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class UpdateKnowledgeObjectRequestContent extends TeaModel {
        /**
         * <p>The document content. This property exists only when Type is set to DOCUMENT.</p>
         */
        @NameInMap("Document")
        public UpdateKnowledgeObjectRequestContentDocument document;

        /**
         * <p>The semantic model content. This property exists only when Type is set to SEMANTIC_MODEL.</p>
         */
        @NameInMap("SemanticModel")
        public UpdateKnowledgeObjectRequestContentSemanticModel semanticModel;

        public static UpdateKnowledgeObjectRequestContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeObjectRequestContent self = new UpdateKnowledgeObjectRequestContent();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeObjectRequestContent setDocument(UpdateKnowledgeObjectRequestContentDocument document) {
            this.document = document;
            return this;
        }
        public UpdateKnowledgeObjectRequestContentDocument getDocument() {
            return this.document;
        }

        public UpdateKnowledgeObjectRequestContent setSemanticModel(UpdateKnowledgeObjectRequestContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public UpdateKnowledgeObjectRequestContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

}
