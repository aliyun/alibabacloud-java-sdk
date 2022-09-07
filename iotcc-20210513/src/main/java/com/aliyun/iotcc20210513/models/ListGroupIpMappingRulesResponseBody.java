// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupIpMappingRulesResponseBody extends TeaModel {
    @NameInMap("IpMappingRules")
    public java.util.List<ListGroupIpMappingRulesResponseBodyIpMappingRules> ipMappingRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListGroupIpMappingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIpMappingRulesResponseBody self = new ListGroupIpMappingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupIpMappingRulesResponseBody setIpMappingRules(java.util.List<ListGroupIpMappingRulesResponseBodyIpMappingRules> ipMappingRules) {
        this.ipMappingRules = ipMappingRules;
        return this;
    }
    public java.util.List<ListGroupIpMappingRulesResponseBodyIpMappingRules> getIpMappingRules() {
        return this.ipMappingRules;
    }

    public ListGroupIpMappingRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupIpMappingRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupIpMappingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupIpMappingRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupIpMappingRulesResponseBodyIpMappingRules extends TeaModel {
        @NameInMap("DestinationIp")
        public String destinationIp;

        @NameInMap("IoTCloudConnectorGroupId")
        public String ioTCloudConnectorGroupId;

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

        public static ListGroupIpMappingRulesResponseBodyIpMappingRules build(java.util.Map<String, ?> map) throws Exception {
            ListGroupIpMappingRulesResponseBodyIpMappingRules self = new ListGroupIpMappingRulesResponseBodyIpMappingRules();
            return TeaModel.build(map, self);
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleDescription(String ipMappingRuleDescription) {
            this.ipMappingRuleDescription = ipMappingRuleDescription;
            return this;
        }
        public String getIpMappingRuleDescription() {
            return this.ipMappingRuleDescription;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleId(String ipMappingRuleId) {
            this.ipMappingRuleId = ipMappingRuleId;
            return this;
        }
        public String getIpMappingRuleId() {
            return this.ipMappingRuleId;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleName(String ipMappingRuleName) {
            this.ipMappingRuleName = ipMappingRuleName;
            return this;
        }
        public String getIpMappingRuleName() {
            return this.ipMappingRuleName;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setIpMappingRuleStatus(String ipMappingRuleStatus) {
            this.ipMappingRuleStatus = ipMappingRuleStatus;
            return this;
        }
        public String getIpMappingRuleStatus() {
            return this.ipMappingRuleStatus;
        }

        public ListGroupIpMappingRulesResponseBodyIpMappingRules setMappingIp(String mappingIp) {
            this.mappingIp = mappingIp;
            return this;
        }
        public String getMappingIp() {
            return this.mappingIp;
        }

    }

}
