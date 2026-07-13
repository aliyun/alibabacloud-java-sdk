// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListWorkersShrinkRequest extends TeaModel {
    @NameInMap("AgentType")
    public String agentType;

    @NameInMap("Credential")
    public String credential;

    @NameInMap("Group")
    public String groupShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Mcp")
    public String mcp;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelProvider")
    public String modelProvider;

    @NameInMap("NameLike")
    public String nameLike;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Template")
    public String templateShrink;

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
