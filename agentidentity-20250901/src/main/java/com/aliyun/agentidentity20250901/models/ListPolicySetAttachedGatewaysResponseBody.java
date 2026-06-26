// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListPolicySetAttachedGatewaysResponseBody extends TeaModel {
    @NameInMap("AttachedGateways")
    public java.util.List<ListPolicySetAttachedGatewaysResponseBodyAttachedGateways> attachedGateways;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AttachedPolicySetName")
        public String attachedPolicySetName;

        @NameInMap("AttachedTime")
        public String attachedTime;

        @NameInMap("EnforcementMode")
        public String enforcementMode;

        @NameInMap("GatewayArn")
        public String gatewayArn;

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
