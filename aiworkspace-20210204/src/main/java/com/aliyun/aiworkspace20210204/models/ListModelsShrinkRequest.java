// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelsShrinkRequest extends TeaModel {
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
    public String conditionsShrink;

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
    public String tagShrink;

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

    public static ListModelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsShrinkRequest self = new ListModelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsShrinkRequest setCollections(String collections) {
        this.collections = collections;
        return this;
    }
    public String getCollections() {
        return this.collections;
    }

    public ListModelsShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public ListModelsShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListModelsShrinkRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListModelsShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelsShrinkRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ListModelsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelsShrinkRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ListModelsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelsShrinkRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListModelsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListModelsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListModelsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListModelsShrinkRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public ListModelsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
