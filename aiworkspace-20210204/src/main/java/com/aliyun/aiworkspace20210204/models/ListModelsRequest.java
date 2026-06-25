// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    /**
     * <p>The collections to which the model belongs. You can specify multiple collections. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>AI4D,QuickStart</p>
     */
    @NameInMap("Collections")
    public String collections;

    /**
     * <p>The conditions.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<ListModelsRequestConditions> conditions;

    /**
     * <p>The domain. This parameter is used to filter the model list by domain. Examples: nlp (natural language processing) and cv (computer vision).</p>
     * 
     * <strong>example:</strong>
     * <p>nlp</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The label string. This parameter is used to filter the list. Models are returned if their label keys or values contain the specified string.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The model name. This parameter is used to filter the model list.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment analysis</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The order in which to sort the results of a paged query. The default value is ASC.</p>
     * <ul>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * <li><p>DESC: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The model source. This parameter is used to filter the model list by community or organization. Examples: ModelScope and HuggingFace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number of the model list. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of models to display on each page in a paged query. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The provider. If you specify a provider, only the public models from that provider are returned. If you leave this parameter empty, your own models are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The query condition. This parameter performs a fuzzy match on ModelName, Domain, Task, LabelKey, and LabelValue. For example, if you enter nlp, models that match in any of these fields are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The field to use for sorting in a paged query. Currently, only the GmtCreateTime field is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Endpoint</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListModelsRequestTag> tag;

    /**
     * <p>The task. This parameter is used to filter the model list by task type. Example: text-classification.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <p>The workspace ID. The returned list contains only the models in the specified workspace. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>324**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setCollections(String collections) {
        this.collections = collections;
        return this;
    }
    public String getCollections() {
        return this.collections;
    }

    public ListModelsRequest setConditions(java.util.List<ListModelsRequestConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<ListModelsRequestConditions> getConditions() {
        return this.conditions;
    }

    public ListModelsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListModelsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelsRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListModelsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListModelsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelsRequest setTag(java.util.List<ListModelsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListModelsRequestTag> getTag() {
        return this.tag;
    }

    public ListModelsRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public ListModelsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListModelsRequestConditions extends TeaModel {
        /**
         * <p>The parameter name. Example: ParameterSize.</p>
         * 
         * <strong>example:</strong>
         * <p>ParameterSize</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The operator. Example: LessThan.</p>
         * 
         * <strong>example:</strong>
         * <p>LessThan</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value. Example: 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListModelsRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            ListModelsRequestConditions self = new ListModelsRequestConditions();
            return TeaModel.build(map, self);
        }

        public ListModelsRequestConditions setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public ListModelsRequestConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListModelsRequestConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListModelsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListModelsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListModelsRequestTag self = new ListModelsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListModelsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListModelsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
