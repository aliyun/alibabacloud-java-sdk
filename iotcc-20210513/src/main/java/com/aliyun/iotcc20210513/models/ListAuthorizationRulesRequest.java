// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesRequest extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    public java.util.List<String> authorizationRuleIds;

    @NameInMap("AuthorizationRuleName")
    public java.util.List<String> authorizationRuleName;

    @NameInMap("AuthorizationRuleStatus")
    public java.util.List<String> authorizationRuleStatus;

    @NameInMap("Destination")
    public java.util.List<String> destination;

    @NameInMap("DestinationType")
    public java.util.List<String> destinationType;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Policy")
    public java.util.List<String> policy;

    @NameInMap("RegionId")
    public String regionId;

    public static ListAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesRequest self = new ListAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesRequest setAuthorizationRuleIds(java.util.List<String> authorizationRuleIds) {
        this.authorizationRuleIds = authorizationRuleIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
    }

    public ListAuthorizationRulesRequest setAuthorizationRuleName(java.util.List<String> authorizationRuleName) {
        this.authorizationRuleName = authorizationRuleName;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    public ListAuthorizationRulesRequest setAuthorizationRuleStatus(java.util.List<String> authorizationRuleStatus) {
        this.authorizationRuleStatus = authorizationRuleStatus;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleStatus() {
        return this.authorizationRuleStatus;
    }

    public ListAuthorizationRulesRequest setDestination(java.util.List<String> destination) {
        this.destination = destination;
        return this;
    }
    public java.util.List<String> getDestination() {
        return this.destination;
    }

    public ListAuthorizationRulesRequest setDestinationType(java.util.List<String> destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public java.util.List<String> getDestinationType() {
        return this.destinationType;
    }

    public ListAuthorizationRulesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListAuthorizationRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesRequest setPolicy(java.util.List<String> policy) {
        this.policy = policy;
        return this;
    }
    public java.util.List<String> getPolicy() {
        return this.policy;
    }

    public ListAuthorizationRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
