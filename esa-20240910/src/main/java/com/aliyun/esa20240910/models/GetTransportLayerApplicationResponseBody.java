// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the Transport Layer Application.</p>
     * 
     * <strong>example:</strong>
     * <p>17099311410****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>The CNAME domain name of the Transport Layer Application. This parameter is returned only if the Site was added using the CNAME method.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com.ialicdn.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>Indicates whether network optimization for access from the Chinese mainland is enabled. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>Indicates whether the IP Access Rule feature is enabled. If enabled, IP Access Rules in Web Application Firewall (WAF) take effect for the Transport Layer Application. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Indicates whether IPv6 is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Indicates whether keep-alive protection is enabled.</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The domain name of the Transport Layer Application.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EB635996-1FD6-5DFD-BA57-27A849599940</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of forwarding rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<GetTransportLayerApplicationResponseBodyRules> rules;

    /**
     * <p>The number of forwarding rules in the Transport Layer Application.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RulesCount")
    public Integer rulesCount;

    /**
     * <p>The ID of the Site.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("StaticIp")
    public String staticIp;

    @NameInMap("StaticIpV4List")
    public java.util.List<GetTransportLayerApplicationResponseBodyStaticIpV4List> staticIpV4List;

    /**
     * <p>The status of the Transport Layer Application. Valid values:</p>
     * <ul>
     * <li><p><strong>deploying</strong>: The application is deploying. You cannot modify or delete the application in this state.</p>
     * </li>
     * <li><p><strong>active</strong>: The application is active.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetTransportLayerApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTransportLayerApplicationResponseBody self = new GetTransportLayerApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTransportLayerApplicationResponseBody setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public GetTransportLayerApplicationResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public GetTransportLayerApplicationResponseBody setCrossBorderOptimization(String crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public GetTransportLayerApplicationResponseBody setIpAccessRule(String ipAccessRule) {
        this.ipAccessRule = ipAccessRule;
        return this;
    }
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    public GetTransportLayerApplicationResponseBody setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public String getIpv6() {
        return this.ipv6;
    }

    public GetTransportLayerApplicationResponseBody setKeepAliveProtection(String keepAliveProtection) {
        this.keepAliveProtection = keepAliveProtection;
        return this;
    }
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    public GetTransportLayerApplicationResponseBody setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public GetTransportLayerApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTransportLayerApplicationResponseBody setRules(java.util.List<GetTransportLayerApplicationResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<GetTransportLayerApplicationResponseBodyRules> getRules() {
        return this.rules;
    }

    public GetTransportLayerApplicationResponseBody setRulesCount(Integer rulesCount) {
        this.rulesCount = rulesCount;
        return this;
    }
    public Integer getRulesCount() {
        return this.rulesCount;
    }

    public GetTransportLayerApplicationResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetTransportLayerApplicationResponseBody setStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }
    public String getStaticIp() {
        return this.staticIp;
    }

    public GetTransportLayerApplicationResponseBody setStaticIpV4List(java.util.List<GetTransportLayerApplicationResponseBodyStaticIpV4List> staticIpV4List) {
        this.staticIpV4List = staticIpV4List;
        return this;
    }
    public java.util.List<GetTransportLayerApplicationResponseBodyStaticIpV4List> getStaticIpV4List() {
        return this.staticIpV4List;
    }

    public GetTransportLayerApplicationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetTransportLayerApplicationResponseBodyRules extends TeaModel {
        /**
         * <p>The client IP pass-through mode. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Client IP pass-through is disabled.</p>
         * </li>
         * <li><p><strong>PPv1</strong>: PROXY Protocol v1, which supports client IP pass-through for TCP.</p>
         * </li>
         * <li><p><strong>PPv2</strong>: PROXY Protocol v2, which supports client IP pass-through for both TCP and UDP.</p>
         * </li>
         * <li><p><strong>SPP</strong>: Simple Proxy Protocol, which supports client IP pass-through for UDP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>A comment about the forwarding rule.</p>
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
         * <li><p>A port range, such as <code>81-85</code> (ports 81 to 85).</p>
         * </li>
         * <li><p>A comma-separated list of ports and port ranges, such as <code>80,81-85,90</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>The protocol for the forwarding rule. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong>: For TCP traffic.</p>
         * </li>
         * <li><p><strong>UDP</strong>: For UDP traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234323***</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The origin. This value must be consistent with the specified origin type.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The origin port. The following formats are supported:</p>
         * <ul>
         * <li><p>A single port. A single origin port can be mapped to one or more edge ports.</p>
         * </li>
         * <li><p>A port range. When mapping a range of edge ports to a range of origin ports, both ranges must contain the same number of ports. For example, you cannot map edge ports <code>90-93</code> (4 ports) to origin ports <code>81-85</code> (5 ports).</p>
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
         * <li><p><strong>OP</strong>: An origin address pool.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static GetTransportLayerApplicationResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            GetTransportLayerApplicationResponseBodyRules self = new GetTransportLayerApplicationResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public GetTransportLayerApplicationResponseBodyRules setClientIPPassThroughMode(String clientIPPassThroughMode) {
            this.clientIPPassThroughMode = clientIPPassThroughMode;
            return this;
        }
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        public GetTransportLayerApplicationResponseBodyRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTransportLayerApplicationResponseBodyRules setEdgePort(String edgePort) {
            this.edgePort = edgePort;
            return this;
        }
        public String getEdgePort() {
            return this.edgePort;
        }

        public GetTransportLayerApplicationResponseBodyRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetTransportLayerApplicationResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetTransportLayerApplicationResponseBodyRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTransportLayerApplicationResponseBodyRules setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public GetTransportLayerApplicationResponseBodyRules setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class GetTransportLayerApplicationResponseBodyStaticIpV4List extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Status")
        public String status;

        public static GetTransportLayerApplicationResponseBodyStaticIpV4List build(java.util.Map<String, ?> map) throws Exception {
            GetTransportLayerApplicationResponseBodyStaticIpV4List self = new GetTransportLayerApplicationResponseBodyStaticIpV4List();
            return TeaModel.build(map, self);
        }

        public GetTransportLayerApplicationResponseBodyStaticIpV4List setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetTransportLayerApplicationResponseBodyStaticIpV4List setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
