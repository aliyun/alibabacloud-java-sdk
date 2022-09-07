// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIpMappingRulesResponseBody extends TeaModel {
    @NameInMap("IpMappingRules")
    public java.util.List<ListIpMappingRulesResponseBodyIpMappingRules> ipMappingRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpMappingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpMappingRulesResponseBody self = new ListIpMappingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpMappingRulesResponseBody setIpMappingRules(java.util.List<ListIpMappingRulesResponseBodyIpMappingRules> ipMappingRules) {
        this.ipMappingRules = ipMappingRules;
        return this;
    }
    public java.util.List<ListIpMappingRulesResponseBodyIpMappingRules> getIpMappingRules() {
        return this.ipMappingRules;
    }

    public ListIpMappingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpMappingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpMappingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpMappingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpMappingRulesResponseBodyIpMappingRules extends TeaModel {
        @NameInMap("DestinationIp")
        public String destinationIp;

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("IpMappingRuleDescription")
        public String ipMappingRuleDescription;

        @NameInMap("IpMappingRuleId")
        public String ipMappingRuleId;

        @NameInMap("IpMappingRuleName")
        public String ipMappingRuleName;

        @NameInMap("IpMappingRuleStatus")
        public String ipMappingRuleStatus;

        @NameInMap("MappingIp")
        public String mappingIp;

        public static ListIpMappingRulesResponseBodyIpMappingRules build(java.util.Map<String, ?> map) throws Exception {
            ListIpMappingRulesResponseBodyIpMappingRules self = new ListIpMappingRulesResponseBodyIpMappingRules();
            return TeaModel.build(map, self);
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleDescription(String ipMappingRuleDescription) {
            this.ipMappingRuleDescription = ipMappingRuleDescription;
            return this;
        }
        public String getIpMappingRuleDescription() {
            return this.ipMappingRuleDescription;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleId(String ipMappingRuleId) {
            this.ipMappingRuleId = ipMappingRuleId;
            return this;
        }
        public String getIpMappingRuleId() {
            return this.ipMappingRuleId;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleName(String ipMappingRuleName) {
            this.ipMappingRuleName = ipMappingRuleName;
            return this;
        }
        public String getIpMappingRuleName() {
            return this.ipMappingRuleName;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleStatus(String ipMappingRuleStatus) {
            this.ipMappingRuleStatus = ipMappingRuleStatus;
            return this;
        }
        public String getIpMappingRuleStatus() {
            return this.ipMappingRuleStatus;
        }

        public ListIpMappingRulesResponseBodyIpMappingRules setMappingIp(String mappingIp) {
            this.mappingIp = mappingIp;
            return this;
        }
        public String getMappingIp() {
            return this.mappingIp;
        }

    }

}
