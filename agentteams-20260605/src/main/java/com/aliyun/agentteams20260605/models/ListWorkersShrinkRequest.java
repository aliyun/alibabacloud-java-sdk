// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkersShrinkRequest extends TeaModel {
    /**
     * <p>The Agent runtime type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwenpaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The credential name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-demo</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>The team group filter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Group")
    public String groupShrink;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-demo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The MCP server name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp-demo</p>
     */
    @NameInMap("Mcp")
    public String mcp;

    /**
     * <p>The model name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model provider filter.</p>
     * 
     * <strong>example:</strong>
     * <p>dashscope</p>
     */
    @NameInMap("ModelProvider")
    public String modelProvider;

    /**
     * <p>The fuzzy match filter for the Worker name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker</p>
     */
    @NameInMap("NameLike")
    public String nameLike;

    /**
     * <p>The pagination token used to query the next page of data.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The template filter.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Template")
    public String templateShrink;

    /**
     * <p>The Worker version number filter.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static ListWorkersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkersShrinkRequest self = new ListWorkersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkersShrinkRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public ListWorkersShrinkRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public ListWorkersShrinkRequest setGroupShrink(String groupShrink) {
        this.groupShrink = groupShrink;
        return this;
    }
    public String getGroupShrink() {
        return this.groupShrink;
    }

    public ListWorkersShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWorkersShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkersShrinkRequest setMcp(String mcp) {
        this.mcp = mcp;
        return this;
    }
    public String getMcp() {
        return this.mcp;
    }

    public ListWorkersShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListWorkersShrinkRequest setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public ListWorkersShrinkRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListWorkersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkersShrinkRequest setTemplateShrink(String templateShrink) {
        this.templateShrink = templateShrink;
        return this;
    }
    public String getTemplateShrink() {
        return this.templateShrink;
    }

    public ListWorkersShrinkRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
