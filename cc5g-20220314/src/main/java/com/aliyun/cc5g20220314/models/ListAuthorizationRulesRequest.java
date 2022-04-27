// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesRequest extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    public java.util.List<String> authorizationRuleIds;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("Dns")
    public Boolean dns;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("Names")
    public java.util.List<String> names;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("Type")
    public String type;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

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

    public ListAuthorizationRulesRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ListAuthorizationRulesRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ListAuthorizationRulesRequest setDns(Boolean dns) {
        this.dns = dns;
        return this;
    }
    public Boolean getDns() {
        return this.dns;
    }

    public ListAuthorizationRulesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizationRulesRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListAuthorizationRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizationRulesRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ListAuthorizationRulesRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListAuthorizationRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListAuthorizationRulesRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
