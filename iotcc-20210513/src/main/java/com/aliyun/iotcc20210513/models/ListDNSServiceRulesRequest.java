// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDNSServiceRulesRequest extends TeaModel {
    @NameInMap("DNSServiceRuleIds")
    public java.util.List<String> DNSServiceRuleIds;

    @NameInMap("DNSServiceRuleName")
    public java.util.List<String> DNSServiceRuleName;

    @NameInMap("DNSServiceRuleStatus")
    public java.util.List<String> DNSServiceRuleStatus;

    @NameInMap("Destination")
    public java.util.List<String> destination;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

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

    public static ListDNSServiceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDNSServiceRulesRequest self = new ListDNSServiceRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListDNSServiceRulesRequest setDNSServiceRuleIds(java.util.List<String> DNSServiceRuleIds) {
        this.DNSServiceRuleIds = DNSServiceRuleIds;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleIds() {
        return this.DNSServiceRuleIds;
    }

    public ListDNSServiceRulesRequest setDNSServiceRuleName(java.util.List<String> DNSServiceRuleName) {
        this.DNSServiceRuleName = DNSServiceRuleName;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleName() {
        return this.DNSServiceRuleName;
    }

    public ListDNSServiceRulesRequest setDNSServiceRuleStatus(java.util.List<String> DNSServiceRuleStatus) {
        this.DNSServiceRuleStatus = DNSServiceRuleStatus;
        return this;
    }
    public java.util.List<String> getDNSServiceRuleStatus() {
        return this.DNSServiceRuleStatus;
    }

    public ListDNSServiceRulesRequest setDestination(java.util.List<String> destination) {
        this.destination = destination;
        return this;
    }
    public java.util.List<String> getDestination() {
        return this.destination;
    }

    public ListDNSServiceRulesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListDNSServiceRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDNSServiceRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDNSServiceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDNSServiceRulesRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ListDNSServiceRulesRequest setSource(java.util.List<String> source) {
        this.source = source;
        return this;
    }
    public java.util.List<String> getSource() {
        return this.source;
    }

}
