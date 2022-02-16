// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListGroupDNSServiceRulesResponseBody extends TeaModel {
    @NameInMap("DNSServiceRules")
    public java.util.List<ListGroupDNSServiceRulesResponseBodyDNSServiceRules> DNSServiceRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListGroupDNSServiceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDNSServiceRulesResponseBody self = new ListGroupDNSServiceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupDNSServiceRulesResponseBody setDNSServiceRules(java.util.List<ListGroupDNSServiceRulesResponseBodyDNSServiceRules> DNSServiceRules) {
        this.DNSServiceRules = DNSServiceRules;
        return this;
    }
    public java.util.List<ListGroupDNSServiceRulesResponseBodyDNSServiceRules> getDNSServiceRules() {
        return this.DNSServiceRules;
    }

    public ListGroupDNSServiceRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGroupDNSServiceRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGroupDNSServiceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupDNSServiceRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupDNSServiceRulesResponseBodyDNSServiceRules extends TeaModel {
        @NameInMap("DNSServiceRuleDescription")
        public String DNSServiceRuleDescription;

        @NameInMap("DNSServiceRuleId")
        public String DNSServiceRuleId;

        @NameInMap("DNSServiceRuleName")
        public String DNSServiceRuleName;

        @NameInMap("DNSServiceRuleStatus")
        public String DNSServiceRuleStatus;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("IoTCloudConnectorGroupId")
        public String ioTCloudConnectorGroupId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Source")
        public String source;

        public static ListGroupDNSServiceRulesResponseBodyDNSServiceRules build(java.util.Map<String, ?> map) throws Exception {
            ListGroupDNSServiceRulesResponseBodyDNSServiceRules self = new ListGroupDNSServiceRulesResponseBodyDNSServiceRules();
            return TeaModel.build(map, self);
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleDescription(String DNSServiceRuleDescription) {
            this.DNSServiceRuleDescription = DNSServiceRuleDescription;
            return this;
        }
        public String getDNSServiceRuleDescription() {
            return this.DNSServiceRuleDescription;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleId(String DNSServiceRuleId) {
            this.DNSServiceRuleId = DNSServiceRuleId;
            return this;
        }
        public String getDNSServiceRuleId() {
            return this.DNSServiceRuleId;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleName(String DNSServiceRuleName) {
            this.DNSServiceRuleName = DNSServiceRuleName;
            return this;
        }
        public String getDNSServiceRuleName() {
            return this.DNSServiceRuleName;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleStatus(String DNSServiceRuleStatus) {
            this.DNSServiceRuleStatus = DNSServiceRuleStatus;
            return this;
        }
        public String getDNSServiceRuleStatus() {
            return this.DNSServiceRuleStatus;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }
        public String getIoTCloudConnectorGroupId() {
            return this.ioTCloudConnectorGroupId;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListGroupDNSServiceRulesResponseBodyDNSServiceRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
