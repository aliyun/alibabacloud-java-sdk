// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeObjectsResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when a request fails.</p>
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
    public ListKnowledgeObjectsResponseBodyData data;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The secure error message returned when a request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
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

    public static ListKnowledgeObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeObjectsResponseBody self = new ListKnowledgeObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeObjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeObjectsResponseBody setData(ListKnowledgeObjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeObjectsResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeObjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeObjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeObjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentDocument extends TeaModel {
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

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentDocument build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentDocument self = new ListKnowledgeObjectsResponseBodyDataObjectsContentDocument();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentDocument setContentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            return this;
        }
        public String getContentFormat() {
            return this.contentFormat;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentDocument setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields extends TeaModel {
        /**
         * <p>The data type of the field. This field must be provided for publicly accessible model fields and is not inferred by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The brief description of the object. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales policy</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets extends TeaModel {
        /**
         * <p>The brief description of the object. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The metadata entity ID returned by Data Map. Clients must pass this value as is and must not concatenate it.</p>
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
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields> fields;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales policy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The explicitly declared primary key field name. This field is optional. Each item must exist in the Fields of the current dataset.</p>
         */
        @NameInMap("PrimaryKey")
        public java.util.List<String> primaryKey;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets setFields(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasetsFields> getFields() {
            return this.fields;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets setPrimaryKey(java.util.List<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public java.util.List<String> getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects extends TeaModel {
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

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }
        public String getDialect() {
            return this.dialect;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression extends TeaModel {
        /**
         * <p>The expressions of the same metric in different SQL dialects. At least one item is required. Dialects are not duplicated.</p>
         */
        @NameInMap("Dialects")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects> dialects;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression setDialects(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects> dialects) {
            this.dialects = dialects;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpressionDialects> getDialects() {
            return this.dialects;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics extends TeaModel {
        /**
         * <p>The name of the semantic dataset to which the metric belongs. This value must be locatable in the Datasets of the current model.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The brief description of the object. This field is editable. Pass an empty string to clear the description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The executable expression. It must contain at least one dialect version and is not auto-generated by the model.</p>
         */
        @NameInMap("Expression")
        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression expression;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales policy</p>
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

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics setExpression(ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression expression) {
            this.expression = expression;
            return this;
        }
        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetricsExpression getExpression() {
            return this.expression;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys extends TeaModel {
        /**
         * <p>The name of the field in the starting dataset that participates in the relationship. This field must be defined in the Fields of the dataset corresponding to FromDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>customer_id</p>
         */
        @NameInMap("FromField")
        public String fromField;

        /**
         * <p>The name of the field in the ending dataset that participates in the relationship. This field must be defined in the Fields of the dataset corresponding to ToDataset.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("ToField")
        public String toField;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys setFromField(String fromField) {
            this.fromField = fromField;
            return this;
        }
        public String getFromField() {
            return this.fromField;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys setToField(String toField) {
            this.toField = toField;
            return this;
        }
        public String getToField() {
            return this.toField;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships extends TeaModel {
        /**
         * <p>The name of the starting semantic dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        @NameInMap("FromDataset")
        public String fromDataset;

        /**
         * <p>The equi-join pairs of fields at both ends of the relationship. For composite relationships, fields are paired one by one.</p>
         */
        @NameInMap("JoinKeys")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys> joinKeys;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales policy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the ending semantic dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>customers</p>
         */
        @NameInMap("ToDataset")
        public String toDataset;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships setFromDataset(String fromDataset) {
            this.fromDataset = fromDataset;
            return this;
        }
        public String getFromDataset() {
            return this.fromDataset;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships setJoinKeys(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys> joinKeys) {
            this.joinKeys = joinKeys;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationshipsJoinKeys> getJoinKeys() {
            return this.joinKeys;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships setToDataset(String toDataset) {
            this.toDataset = toDataset;
            return this;
        }
        public String getToDataset() {
            return this.toDataset;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel extends TeaModel {
        /**
         * <p>The logical datasets included in the model. An empty array is returned if no public datasets are available.</p>
         */
        @NameInMap("Datasets")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets> datasets;

        /**
         * <p>The executable metrics in the model. An empty array is returned if no metrics are available. Metrics with only candidate formulas are not included.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics> metrics;

        /**
         * <p>The defined relationships in the model expressed by field pairs. An empty array is returned if no relationships are available. Relationships are not inferred from graph paths.</p>
         */
        @NameInMap("Relationships")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships> relationships;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel self = new ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel setDatasets(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets> datasets) {
            this.datasets = datasets;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelDatasets> getDatasets() {
            return this.datasets;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel setMetrics(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelMetrics> getMetrics() {
            return this.metrics;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel setRelationships(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships> relationships) {
            this.relationships = relationships;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModelRelationships> getRelationships() {
            return this.relationships;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsContent extends TeaModel {
        /**
         * <p>The document content. This field exists only when Type is set to DOCUMENT.</p>
         */
        @NameInMap("Document")
        public ListKnowledgeObjectsResponseBodyDataObjectsContentDocument document;

        /**
         * <p>The semantic model content. This field exists only when Type is set to SEMANTIC_MODEL.</p>
         */
        @NameInMap("SemanticModel")
        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel semanticModel;

        public static ListKnowledgeObjectsResponseBodyDataObjectsContent build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsContent self = new ListKnowledgeObjectsResponseBodyDataObjectsContent();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContent setDocument(ListKnowledgeObjectsResponseBodyDataObjectsContentDocument document) {
            this.document = document;
            return this;
        }
        public ListKnowledgeObjectsResponseBodyDataObjectsContentDocument getDocument() {
            return this.document;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsContent setSemanticModel(ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel semanticModel) {
            this.semanticModel = semanticModel;
            return this;
        }
        public ListKnowledgeObjectsResponseBodyDataObjectsContentSemanticModel getSemanticModel() {
            return this.semanticModel;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles extends TeaModel {
        /**
         * <p>The temporary download URL of the specification YAML file. The validity period is subject to ExpiresIn.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/short-lived-result-download">https://example.invalid/short-lived-result-download</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The original file name of the uploaded document. This field is read-only. Renaming the Name field does not change this value. This field is not returned for external documents and semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles self = new ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences extends TeaModel {
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

        public static ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences self = new ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyDataObjects extends TeaModel {
        /**
         * <p>The typed content of the knowledge object. The semantic model content or document content is returned based on the Type.</p>
         */
        @NameInMap("Content")
        public ListKnowledgeObjectsResponseBodyDataObjectsContent content;

        /**
         * <p>The time when the object was first created.</p>
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
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The download items for multi-file specification YAMLs, including file names and temporary download URLs.</p>
         */
        @NameInMap("DownloadFiles")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles> downloadFiles;

        /**
         * <p>The temporary download URL of the specification YAML file. The validity period is subject to ExpiresIn.</p>
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
         * <p>The validity period of the knowledge object download URL in seconds. The current value is 300 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ExpiresIn")
        public Integer expiresIn;

        /**
         * <p>The original file name of the uploaded document. This field is read-only. Renaming the Name field does not change this value. This field is not returned for external documents and semantic models.</p>
         * 
         * <strong>example:</strong>
         * <p>policy.md</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The knowledge base to which the object belongs.</p>
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
         * <p>The time when the current content was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200800000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user-facing name of the object. This field is editable. Renaming the object does not change the KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales policy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the uploaded original file in bytes. This field is read-only and does not represent the length of the edited body text.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SizeBytes")
        public Long sizeBytes;

        /**
         * <p>The array of source references. Currently, an empty array is returned.</p>
         */
        @NameInMap("SourceReferences")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences> sourceReferences;

        /**
         * <p>The knowledge object type. The current values are SEMANTIC_MODEL and DOCUMENT. More types may be added in the future.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCUMENT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The current version of the SEMANTIC_MODEL being read. Pass this value when updating content. The version can be edited in place.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static ListKnowledgeObjectsResponseBodyDataObjects build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyDataObjects self = new ListKnowledgeObjectsResponseBodyDataObjects();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setContent(ListKnowledgeObjectsResponseBodyDataObjectsContent content) {
            this.content = content;
            return this;
        }
        public ListKnowledgeObjectsResponseBodyDataObjectsContent getContent() {
            return this.content;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setDownloadFiles(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles> downloadFiles) {
            this.downloadFiles = downloadFiles;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsDownloadFiles> getDownloadFiles() {
            return this.downloadFiles;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setExpiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setKnowledgeObjectId(String knowledgeObjectId) {
            this.knowledgeObjectId = knowledgeObjectId;
            return this;
        }
        public String getKnowledgeObjectId() {
            return this.knowledgeObjectId;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setSizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setSourceReferences(java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences> sourceReferences) {
            this.sourceReferences = sourceReferences;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjectsSourceReferences> getSourceReferences() {
            return this.sourceReferences;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListKnowledgeObjectsResponseBodyDataObjects setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class ListKnowledgeObjectsResponseBodyData extends TeaModel {
        /**
         * <p>The cursor for the next page. The value is null if there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The knowledge objects that the caller has permission to read on the current page.</p>
         */
        @NameInMap("Objects")
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjects> objects;

        public static ListKnowledgeObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeObjectsResponseBodyData self = new ListKnowledgeObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeObjectsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListKnowledgeObjectsResponseBodyData setObjects(java.util.List<ListKnowledgeObjectsResponseBodyDataObjects> objects) {
            this.objects = objects;
            return this;
        }
        public java.util.List<ListKnowledgeObjectsResponseBodyDataObjects> getObjects() {
            return this.objects;
        }

    }

}
