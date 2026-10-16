// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPolicySetAttachedGatewaysResponseBody extends TeaModel {
    /**
     * <p>The list of attached gateways.</p>
     */
    @NameInMap("AttachedGateways")
    public java.util.List<ListPolicySetAttachedGatewaysResponseBodyAttachedGateways> attachedGateways;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicySetAttachedGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicySetAttachedGatewaysResponseBody self = new ListPolicySetAttachedGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicySetAttachedGatewaysResponseBody setAttachedGateways(java.util.List<ListPolicySetAttachedGatewaysResponseBodyAttachedGateways> attachedGateways) {
        this.attachedGateways = attachedGateways;
        return this;
    }
    public java.util.List<ListPolicySetAttachedGatewaysResponseBodyAttachedGateways> getAttachedGateways() {
        return this.attachedGateways;
    }

    public ListPolicySetAttachedGatewaysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPolicySetAttachedGatewaysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPolicySetAttachedGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicySetAttachedGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicySetAttachedGatewaysResponseBodyAttachedGateways extends TeaModel {
        /**
         * <p>The name of the policy set that is currently in effect on the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        @NameInMap("AttachedPolicySetName")
        public String attachedPolicySetName;

        /**
         * <p>The time when the policy set was attached to the gateway, in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The policy enforcement mode. Valid values:</p>
         * <ul>
         * <li>ENFORCE: Blocks non-compliant requests and allows compliant requests.</li>
         * <li>LOG_ONLY: Only logs non-compliant requests without blocking them.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENFORCE</p>
         */
        @NameInMap("EnforcementMode")
        public String enforcementMode;

        /**
         * <p>The ARN of the target gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:gateway/my-gateway</p>
         */
        @NameInMap("GatewayArn")
        public String gatewayArn;

        /**
         * <p>The gateway type. Valid values:</p>
         * <ul>
         * <li>AIGateway: Alibaba Cloud AI Gateway</li>
         * <li>AgentRunMCP: AgentRun MCP tool</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AIGateway</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        public static ListPolicySetAttachedGatewaysResponseBodyAttachedGateways build(java.util.Map<String, ?> map) throws Exception {
            ListPolicySetAttachedGatewaysResponseBodyAttachedGateways self = new ListPolicySetAttachedGatewaysResponseBodyAttachedGateways();
            return TeaModel.build(map, self);
        }

        public ListPolicySetAttachedGatewaysResponseBodyAttachedGateways setAttachedPolicySetName(String attachedPolicySetName) {
            this.attachedPolicySetName = attachedPolicySetName;
            return this;
        }
        public String getAttachedPolicySetName() {
            return this.attachedPolicySetName;
        }

        public ListPolicySetAttachedGatewaysResponseBodyAttachedGateways setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public ListPolicySetAttachedGatewaysResponseBodyAttachedGateways setEnforcementMode(String enforcementMode) {
            this.enforcementMode = enforcementMode;
            return this;
        }
        public String getEnforcementMode() {
            return this.enforcementMode;
        }

        public ListPolicySetAttachedGatewaysResponseBodyAttachedGateways setGatewayArn(String gatewayArn) {
            this.gatewayArn = gatewayArn;
            return this;
        }
        public String getGatewayArn() {
            return this.gatewayArn;
        }

        public ListPolicySetAttachedGatewaysResponseBodyAttachedGateways setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

    }

}
