// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIpMappingRulesRequest extends TeaModel {
    @NameInMap("DestinationIps")
    public java.util.List<String> destinationIps;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("IpMappingRuleIds")
    public java.util.List<String> ipMappingRuleIds;

    @NameInMap("IpMappingRuleNames")
    public java.util.List<String> ipMappingRuleNames;

    @NameInMap("IpMappingRuleStatuses")
    public java.util.List<String> ipMappingRuleStatuses;

    @NameInMap("MappingIps")
    public java.util.List<String> mappingIps;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListIpMappingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpMappingRulesRequest self = new ListIpMappingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListIpMappingRulesRequest setDestinationIps(java.util.List<String> destinationIps) {
        this.destinationIps = destinationIps;
        return this;
    }
    public java.util.List<String> getDestinationIps() {
        return this.destinationIps;
    }

    public ListIpMappingRulesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public ListIpMappingRulesRequest setIpMappingRuleIds(java.util.List<String> ipMappingRuleIds) {
        this.ipMappingRuleIds = ipMappingRuleIds;
        return this;
    }
    public java.util.List<String> getIpMappingRuleIds() {
        return this.ipMappingRuleIds;
    }

    public ListIpMappingRulesRequest setIpMappingRuleNames(java.util.List<String> ipMappingRuleNames) {
        this.ipMappingRuleNames = ipMappingRuleNames;
        return this;
    }
    public java.util.List<String> getIpMappingRuleNames() {
        return this.ipMappingRuleNames;
    }

    public ListIpMappingRulesRequest setIpMappingRuleStatuses(java.util.List<String> ipMappingRuleStatuses) {
        this.ipMappingRuleStatuses = ipMappingRuleStatuses;
        return this;
    }
    public java.util.List<String> getIpMappingRuleStatuses() {
        return this.ipMappingRuleStatuses;
    }

    public ListIpMappingRulesRequest setMappingIps(java.util.List<String> mappingIps) {
        this.mappingIps = mappingIps;
        return this;
    }
    public java.util.List<String> getMappingIps() {
        return this.mappingIps;
    }

    public ListIpMappingRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpMappingRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpMappingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
