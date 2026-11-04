// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListPermissionRulesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>token-example</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The principal ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>The principal name.</p>
     * 
     * <strong>example:</strong>
     * <p>example-user</p>
     */
    @NameInMap("principalName")
    public String principalName;

    /**
     * <p>The principal type.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("principalType")
    public String principalType;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-1234567890</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The rule source.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentCore</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The rule target.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-1234567890</p>
     */
    @NameInMap("target")
    public String target;

    public static ListPermissionRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionRulesRequest self = new ListPermissionRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPermissionRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPermissionRulesRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public ListPermissionRulesRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

    public ListPermissionRulesRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public ListPermissionRulesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListPermissionRulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListPermissionRulesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListPermissionRulesRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
