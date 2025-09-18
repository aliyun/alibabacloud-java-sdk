// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsResponseBody extends TeaModel {
    /**
     * <p>List of transport layer applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListTransportLayerApplicationsResponseBodyApplications> applications;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of transport layer applications.</p>
     * 
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
         * <p>Client IP pass-through protocol, supports:</p>
         * <ul>
         * <li><strong>off</strong>: No pass-through.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>Comment information for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Edge port. Supports:</p>
         * <ul>
         * <li>A single port, e.g., 80.</li>
         * <li>Port range, e.g., 81-85, representing ports 81, 82, 83, 84, 85.</li>
         * <li>Combination of ports and port ranges, separated by commas, e.g., 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, 90.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>Forwarding rule protocol, with values:</p>
         * <ul>
         * <li>TCP: TCP protocol.</li>
         * <li>UDP: UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Layer 4 acceleration rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20258028****</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>Specific value of the source, which needs to match the source type.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Source port. Supports:</p>
         * <ul>
         * <li>A single port, when the source port is a single port, any valid combination of edge ports is supported.</li>
         * <li>Port range, only when the edge port is a port range, the source port can be set to a port range, and the range size must be consistent with the edge port. For example, if the edge port is 90-93, the source port cannot be set to 81-85 because the source port range is 5 and the edge port range is 3, which are inconsistent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>Source type, supports:</p>
         * <ul>
         * <li><strong>ip</strong>: IP.</li>
         * <li><strong>domain</strong>: Domain name.</li>
         * <li><strong>OP</strong>: Origin pool.</li>
         * <li><strong>LB</strong>: Load balancer.</li>
         * </ul>
         * 
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

    public static class ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Status")
        public String status;

        public static ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List build(java.util.Map<String, ?> map) throws Exception {
            ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List self = new ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List();
            return TeaModel.build(map, self);
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListTransportLayerApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <p>Layer 4 application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>170997271816****</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>CNAME domain name corresponding to the Layer 4 acceleration application. This field is not empty only when the site is accessed via CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.ialicdn.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>Whether to enable China mainland network access optimization. It is disabled by default. The value range is:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CrossBorderOptimization")
        public String crossBorderOptimization;

        /**
         * <p>IP access rule switch. When enabled, the IP access rules in WAF take effect on the Layer 4 application.</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("IpAccessRule")
        public String ipAccessRule;

        /**
         * <p>IPv6 switch.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Ipv6")
        public String ipv6;

        /**
         * <p>Domain name of the Layer 4 application.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>List of forwarding rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsRules> rules;

        /**
         * <p>Number of forwarding rules contained in the Layer 4 acceleration application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RulesCount")
        public Integer rulesCount;

        /**
         * <p>Site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36556540048****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        @NameInMap("StaticIp")
        public String staticIp;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StaticIpV4List")
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List> staticIpV4List;

        /**
         * <p>Status of the Layer 4 application</p>
         * <ul>
         * <li><strong>deploying</strong>: Deploying. In this state, modification and deletion are not allowed.</li>
         * <li><strong>active</strong>: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
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

        public ListTransportLayerApplicationsResponseBodyApplications setStaticIp(String staticIp) {
            this.staticIp = staticIp;
            return this;
        }
        public String getStaticIp() {
            return this.staticIp;
        }

        public ListTransportLayerApplicationsResponseBodyApplications setStaticIpV4List(java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List> staticIpV4List) {
            this.staticIpV4List = staticIpV4List;
            return this;
        }
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List> getStaticIpV4List() {
            return this.staticIpV4List;
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
