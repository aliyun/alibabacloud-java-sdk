// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListTransportLayerApplicationsResponseBody extends TeaModel {
    /**
     * <p>A list of transport layer applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListTransportLayerApplicationsResponseBodyApplications> applications;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of transport layer applications.</p>
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
         * <p>Specifies whether and how to pass the client\&quot;s IP address to the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Disables client IP pass-through.</p>
         * </li>
         * <li><p><strong>PPv1</strong>: The PROXY Protocol v1, which supports client IP pass-through for TCP traffic.</p>
         * </li>
         * <li><p><strong>PPv2</strong>: The PROXY Protocol v2, which supports client IP pass-through for both TCP and UDP traffic.</p>
         * </li>
         * <li><p><strong>SPP</strong>: The Simple Proxy Protocol, which supports client IP pass-through for UDP traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>The comment for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The edge port. The following formats are supported:</p>
         * <ul>
         * <li><p>A single port, for example, <code>80</code>.</p>
         * </li>
         * <li><p>A port range, for example, <code>81-85</code>, which includes ports 81, 82, 83, 84, and 85.</p>
         * </li>
         * <li><p>A combination of ports and port ranges separated by commas, for example, <code>80,81-85,90</code>, which includes ports 80, 81, 82, 83, 84, 85, and 90.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>The protocol of the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong>: The TCP protocol.</p>
         * </li>
         * <li><p><strong>UDP</strong>: The UDP protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The unique ID of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20258028****</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The origin address. The value of this parameter must match the <code>SourceType</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The origin port. The following formats are supported:</p>
         * <ul>
         * <li><p>A single port. If you specify a single origin port, you can use any valid combination of edge ports.</p>
         * </li>
         * <li><p>A port range. The origin port can be a port range only if the edge port is also a port range. The number of ports in the origin port range must be the same as that in the edge port range. For example, if the edge port range is <code>90-93</code> (which contains 4 ports), you cannot set the origin port range to <code>81-85</code> (which contains 5 ports) because their sizes do not match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>The origin type. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An IP address.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain name.</p>
         * </li>
         * <li><p><strong>OP</strong>: An origin pool.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer.</p>
         * </li>
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
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.2</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The health status of the IP address. Valid values:</p>
         * <ul>
         * <li><p>healthy: The IP address is passing health checks.</p>
         * </li>
         * <li><p>unhealthy: The IP address is failing health checks.</p>
         * </li>
         * <li><p>unknown: The IP address is being provisioned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
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
         * <p>The transport layer application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>170997271816****</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The CNAME for the transport layer application. This parameter is returned only when the site is onboarded by using a CNAME record.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.ialicdn.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>Specifies whether cross-border optimization is enabled for Chinese mainland network access. By default, this feature is disabled. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CrossBorderOptimization")
        public String crossBorderOptimization;

        /**
         * <p>Specifies whether the IP access rule feature is enabled. When enabled, the IP access rules in WAF apply to this transport layer application.</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("IpAccessRule")
        public String ipAccessRule;

        /**
         * <p>Specifies whether IPv6 is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Ipv6")
        public String ipv6;

        /**
         * <p>Specifies whether keep-alive protection is enabled.</p>
         */
        @NameInMap("KeepAliveProtection")
        public String keepAliveProtection;

        /**
         * <p>The domain name of the transport layer application.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>A list of forwarding rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsRules> rules;

        /**
         * <p>The number of forwarding rules in the transport layer application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RulesCount")
        public Integer rulesCount;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36556540048****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>Specifies whether the static IP feature is enabled. By default, this feature is disabled. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StaticIp")
        public String staticIp;

        /**
         * <p>A list of static IPv4 addresses assigned to the application when the static IP feature is enabled.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("StaticIpV4List")
        public java.util.List<ListTransportLayerApplicationsResponseBodyApplicationsStaticIpV4List> staticIpV4List;

        /**
         * <p>The status of the transport layer application. Valid values:</p>
         * <ul>
         * <li><p><strong>deploying</strong>: The application is being deployed. You cannot modify or delete the application in this state.</p>
         * </li>
         * <li><p><strong>active</strong>: The application is running.</p>
         * </li>
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

        public ListTransportLayerApplicationsResponseBodyApplications setKeepAliveProtection(String keepAliveProtection) {
            this.keepAliveProtection = keepAliveProtection;
            return this;
        }
        public String getKeepAliveProtection() {
            return this.keepAliveProtection;
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
