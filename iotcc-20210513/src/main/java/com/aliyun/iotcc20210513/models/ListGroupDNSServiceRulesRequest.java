// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupDNSServiceRulesRequest extends TeaModel {
    @NameInMap("DNSServiceRuleIds")
    public java.util.List<String> DNSServiceRuleIds;

    @NameInMap("DNSServiceRuleName")
    public java.util.List<String> DNSServiceRuleName;

    @NameInMap("DNSServiceRuleStatus")
    public java.util.List<String> DNSServiceRuleStatus;

    @NameInMap("Destination")
    public java.util.List<String> destination;

    @NameInMap("IoTCloudConnectorGroupId")
    public String ioTCloudConnectorGroupId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Source")
    public java.util.List<String> source;

    public static ListGroupDNSServiceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDNSServiceRulesRequest self = new ListGroupDNSServiceRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupDNSServiceRulesRequest setDNSServiceRuleIds(java.util.List<String> DNSServiceRuleIds) {
        this.DNSServiceRuleIds = DNSServiceRuleIds;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleIds() {
        return this.DNSServiceRuleIds;
    }

    public ListGroupDNSServiceRulesRequest setDNSServiceRuleName(java.util.List<String> DNSServiceRuleName) {
        this.DNSServiceRuleName = DNSServiceRuleName;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    public ListGroupDNSServiceRulesRequest setDNSServiceRuleStatus(java.util.List<String> DNSServiceRuleStatus) {
        this.DNSServiceRuleStatus = DNSServiceRuleStatus;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleStatus() {
        return this.DNSServiceRuleStatus;
    }

    public ListGroupDNSServiceRulesRequest setDestination(java.util.List<String> destination) {
        this.destination = destination;
        return this;
    }
    public java.util.List<String> getDestination() {
        return this.destination;
    }

    public ListGroupDNSServiceRulesRequest setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
        this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
        return this;
    }
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    public ListGroupDNSServiceRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupDNSServiceRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupDNSServiceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGroupDNSServiceRulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListGroupDNSServiceRulesRequest setSource(java.util.List<String> source) {
        this.source = source;
        return this;
    }
    public java.util.List<String> getSource() {
        return this.source;
    }

}
