// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    /**
     * <p>The list of connection IDs.</p>
     */
    @NameInMap("ConnectionIds")
    public java.util.List<String> connectionIds;

    /**
     * <p>The connection name.</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The list of connection types.</p>
     */
    @NameInMap("ConnectionTypes")
    public java.util.List<String> connectionTypes;

    /**
     * <p>The encryption settings. Valid values:</p>
     * <ul>
     * <li>PlainText</li>
     * <li>Secret</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("EncryptOption")
    public String encryptOption;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The model identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The list of model types.</p>
     */
    @NameInMap("ModelTypes")
    public java.util.List<String> modelTypes;

    /**
     * <p>The pagination token that indicates the start position from which to retrieve data on the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order in which the entries are sorted by the specific field on the returned page. This parameter must be used together with SortBy.</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field used to sort the results in queries by page. Default value: GmtCreateTime. Valid value:</p>
     * <ul>
     * <li>GmtCreateTime: The results are sorted by creation time. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether a tool can be called by using ToolCall. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ToolCall")
    public Boolean toolCall;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsRequest self = new ListConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConnectionsRequest setConnectionIds(java.util.List<String> connectionIds) {
        this.connectionIds = connectionIds;
        return this;
    }
    public java.util.List<String> getConnectionIds() {
        return this.connectionIds;
    }

    public ListConnectionsRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public ListConnectionsRequest setConnectionTypes(java.util.List<String> connectionTypes) {
        this.connectionTypes = connectionTypes;
        return this;
    }
    public java.util.List<String> getConnectionTypes() {
        return this.connectionTypes;
    }

    public ListConnectionsRequest setEncryptOption(String encryptOption) {
        this.encryptOption = encryptOption;
        return this;
    }
    public String getEncryptOption() {
        return this.encryptOption;
    }

    public ListConnectionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListConnectionsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListConnectionsRequest setModelTypes(java.util.List<String> modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public java.util.List<String> getModelTypes() {
        return this.modelTypes;
    }

    public ListConnectionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConnectionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListConnectionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListConnectionsRequest setToolCall(Boolean toolCall) {
        this.toolCall = toolCall;
        return this;
    }
    public Boolean getToolCall() {
        return this.toolCall;
    }

    public ListConnectionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
