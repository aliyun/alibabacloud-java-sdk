// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListGroupAuthorizationRulesRequest extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    public java.util.List<String> authorizationRuleIds;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationPort")
    public String destinationPort;

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

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("Type")
    public String type;

    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    public static ListGroupAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupAuthorizationRulesRequest self = new ListGroupAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupAuthorizationRulesRequest setAuthorizationRuleIds(java.util.List<String> authorizationRuleIds) {
        this.authorizationRuleIds = authorizationRuleIds;
        return this;
    }
    public java.util.List<String> getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
    }

    public ListGroupAuthorizationRulesRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public ListGroupAuthorizationRulesRequest setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public String getDestinationPort() {
        return this.destinationPort;
    }

    public ListGroupAuthorizationRulesRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ListGroupAuthorizationRulesRequest setDns(Boolean dns) {
        this.dns = dns;
        return this;
    }
    public Boolean getDns() {
        return this.dns;
    }

    public ListGroupAuthorizationRulesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListGroupAuthorizationRulesRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListGroupAuthorizationRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupAuthorizationRulesRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ListGroupAuthorizationRulesRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListGroupAuthorizationRulesRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListGroupAuthorizationRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListGroupAuthorizationRulesRequest setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

}
