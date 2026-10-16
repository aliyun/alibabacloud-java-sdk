// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPolicySetAttachedGatewaysRequest extends TeaModel {
    /**
     * <p>The gateway type. Valid values:</p>
     * <ul>
     * <li>AIGateway: Alibaba Cloud AI Gateway</li>
     * <li>AgentRunMCP: AgentRun MCP tool</li>
     * </ul>
     * <p>Default value: AIGateway.</p>
     * 
     * <strong>example:</strong>
     * <p>AIGateway</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used for pagination. You do not need to specify this parameter for the first call. For subsequent calls, pass the NextToken value returned from the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>default-policy-set</p>
     */
    @NameInMap("PolicySetName")
    public String policySetName;

    public static ListPolicySetAttachedGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicySetAttachedGatewaysRequest self = new ListPolicySetAttachedGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicySetAttachedGatewaysRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListPolicySetAttachedGatewaysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPolicySetAttachedGatewaysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicySetAttachedGatewaysRequest setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
        return this;
    }
    public String getPolicySetName() {
        return this.policySetName;
    }

}
