// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListDNSServiceRulesResponseBody extends TeaModel {
    @NameInMap("DNSServiceRules")
    public java.util.List<ListDNSServiceRulesResponseBodyDNSServiceRules> DNSServiceRules;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDNSServiceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDNSServiceRulesResponseBody self = new ListDNSServiceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDNSServiceRulesResponseBody setDNSServiceRules(java.util.List<ListDNSServiceRulesResponseBodyDNSServiceRules> DNSServiceRules) {
        this.DNSServiceRules = DNSServiceRules;
        return this;
    }
    public java.util.List<ListDNSServiceRulesResponseBodyDNSServiceRules> getDNSServiceRules() {
        return this.DNSServiceRules;
    }

    public ListDNSServiceRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDNSServiceRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDNSServiceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDNSServiceRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDNSServiceRulesResponseBodyDNSServiceRules extends TeaModel {
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

        @NameInMap("IoTCloudConnectorId")
        public String ioTCloudConnectorId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Source")
        public String source;

        public static ListDNSServiceRulesResponseBodyDNSServiceRules build(java.util.Map<String, ?> map) throws Exception {
            ListDNSServiceRulesResponseBodyDNSServiceRules self = new ListDNSServiceRulesResponseBodyDNSServiceRules();
            return TeaModel.build(map, self);
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleDescription(String DNSServiceRuleDescription) {
            this.DNSServiceRuleDescription = DNSServiceRuleDescription;
            return this;
        }
        public String getDNSServiceRuleDescription() {
            return this.DNSServiceRuleDescription;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleId(String DNSServiceRuleId) {
            this.DNSServiceRuleId = DNSServiceRuleId;
            return this;
        }
        public String getDNSServiceRuleId() {
            return this.DNSServiceRuleId;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleName(String DNSServiceRuleName) {
            this.DNSServiceRuleName = DNSServiceRuleName;
            return this;
        }
        public String getDNSServiceRuleName() {
            return this.DNSServiceRuleName;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setDNSServiceRuleStatus(String DNSServiceRuleStatus) {
            this.DNSServiceRuleStatus = DNSServiceRuleStatus;
            return this;
        }
        public String getDNSServiceRuleStatus() {
            return this.DNSServiceRuleStatus;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setIoTCloudConnectorId(String ioTCloudConnectorId) {
            this.ioTCloudConnectorId = ioTCloudConnectorId;
            return this;
        }
        public String getIoTCloudConnectorId() {
            return this.ioTCloudConnectorId;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListDNSServiceRulesResponseBodyDNSServiceRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
