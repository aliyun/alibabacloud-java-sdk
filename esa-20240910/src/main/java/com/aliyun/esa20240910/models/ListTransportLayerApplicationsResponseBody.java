// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListTransportLayerApplicationsResponseBodyApplications> applications;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTransportLayerApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransportLayerApplicationsResponseBody self = new ListTransportLayerApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransportLayerApplicationsResponseBody setApplications(java.util.List<ListTransportLayerApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListTransportLayerApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListTransportLayerApplicationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransportLayerApplicationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransportLayerApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransportLayerApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTransportLayerApplicationsResponseBodyApplicationsRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>20258028****</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static ListTransportLayerApplicationsResponseBodyApplicationsRules build(java.util.Map<String, ?> map) throws Exception {
            ListTransportLayerApplicationsResponseBodyApplicationsRules self = new ListTransportLayerApplicationsResponseBodyApplicationsRules();
            return TeaModel.build(map, self);
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setClientIPPassThroughMode(String clientIPPassThroughMode) {
            this.clientIPPassThroughMode = clientIPPassThroughMode;
            return this;
        }
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setEdgePort(String edgePort) {
            this.edgePort = edgePort;
            return this;
        }
        public String getEdgePort() {
            return this.edgePort;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsRules setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListTransportLayerApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>170997271816****</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <strong>example:</strong>
         * <p>example.com.ialicdn.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        @NameInMap("CrossBorderOptimization")
        public String crossBorderOptimization;

        @NameInMap("IpAccessRule")
        public String ipAccessRule;

        @NameInMap("Ipv6")
        public String ipv6;

        /**
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        @NameInMap("Rules")
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsRules> rules;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RulesCount")
        public Integer rulesCount;

        /**
         * <strong>example:</strong>
         * <p>36556540048****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        @NameInMap("Status")
        public String status;

        public static ListTransportLayerApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListTransportLayerApplicationsResponseBodyApplications self = new ListTransportLayerApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListTransportLayerApplicationsResponseBodyApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setCrossBorderOptimization(String crossBorderOptimization) {
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }
        public String getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setIpAccessRule(String ipAccessRule) {
            this.ipAccessRule = ipAccessRule;
            return this;
        }
        public String getIpAccessRule() {
            return this.ipAccessRule;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setIpv6(String ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public String getIpv6() {
            return this.ipv6;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setRules(java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsRules> getRules() {
            return this.rules;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setRulesCount(Integer rulesCount) {
            this.rulesCount = rulesCount;
            return this;
        }
        public Integer getRulesCount() {
            return this.rulesCount;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
