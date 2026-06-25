// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConnectionsRequest extends TeaModel {
    /**
     * <p>Visibility of the connection. Valid values:</p>
     * <ul>
     * <li><p>PUBLIC: visible to all workspace members.</p>
     * </li>
     * <li><p>PRIVATE: visible only to the creator.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>List of connection IDs to filter by.</p>
     */
    @NameInMap("ConnectionIds")
    public java.util.List<String> connectionIds;

    /**
     * <p>Connection name. Supports fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>Database connection</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>List of connection types to filter by.</p>
     */
    @NameInMap("ConnectionTypes")
    public java.util.List<String> connectionTypes;

    /**
     * <p>Alibaba Cloud account ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12908*******3242</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>Encryption option for sensitive fields in the response. Valid values:</p>
     * <ul>
     * <li><p>PlainText: returns values in plaintext.</p>
     * </li>
     * <li><p>Secret: returns values in ciphertext.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("EncryptOption")
    public String encryptOption;

    /**
     * <p>Maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Model identifier. Filters connections associated with this model.</p>
     * 
     * <strong>example:</strong>
     * <p>model_001</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>List of model types to filter by.</p>
     */
    @NameInMap("ModelTypes")
    public java.util.List<String> modelTypes;

    /**
     * <p>The token that marks the starting position for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Sort order. Use with the SortBy parameter. Valid values:</p>
     * <ul>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * <li><p>DESC (default): descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Field by which to sort results. Default value: GmtCreateTime. Valid values:</p>
     * <ul>
     * <li>GmtCreateTime (default): sorts by creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Whether tool calling is supported. Valid values:</p>
     * <ul>
     * <li><p>true: supported.</p>
     * </li>
     * <li><p>false: not supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ToolCall")
    public Boolean toolCall;

    /**
     * <p>Workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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

    public ListConnectionsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
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

    public ListConnectionsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
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
