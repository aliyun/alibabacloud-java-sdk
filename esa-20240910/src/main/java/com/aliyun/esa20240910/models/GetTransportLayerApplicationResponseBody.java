// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <p>The Layer 4 application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17099311410****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>The CNAME domain name of the Layer 4 acceleration application. This field is non-empty only when the site is connected by using the CNAME method.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com.ialicdn.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>Specifies whether to enable network access optimization for the Chinese mainland. This feature is disabled by default. Valid values:</p>
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
     * <p>The IP access rule switch. When enabled, IP access rules in WAF take effect for the Layer 4 application. Valid values:</p>
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
     * <p>The IPv6 switch. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Specifies whether to enable keep-alive protection. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The domain name of the Layer 4 application.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB635996-1FD6-5DFD-BA57-27A849599940</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of forwarding rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<GetTransportLayerApplicationResponseBodyRules> rules;

    /**
     * <p>The number of forwarding rules in the Layer 4 acceleration application.</p>
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
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to enable static IP. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("StaticIp")
    public String staticIp;

    /**
     * <p>The list of static IPv4 addresses assigned to this Layer 4 application after the static IP feature is enabled.</p>
     */
    @NameInMap("StaticIpV4List")
    public java.util.List<GetTransportLayerApplicationResponseBodyStaticIpV4List> staticIpV4List;

    /**
     * <p>The Layer 4 application status. Valid values:</p>
     * <ul>
     * <li><strong>deploying</strong>: Being deployed. Modifications and deletions are not allowed in this state.</li>
     * <li><strong>active</strong>: Active.</li>
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
         * <p>The client IP pass-through protocol. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: disabled.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, which supports client IP pass-through for TCP.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, which supports client IP pass-through for TCP and UDP.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, which supports client IP pass-through for UDP.</li>
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
         * <li>A single port, such as 80.</li>
         * <li>A port range, such as 81-85, which represents ports 81, 82, 83, 84, and 85.</li>
         * <li>A combination of ports and port ranges separated by commas, such as 80,81-85,90, which represents ports 80, 81, 82, 83, 84, 85, and 90.</li>
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
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234323***</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The specific value of the origin server, which must match the origin server type.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The origin server port. The following formats are supported:</p>
         * <ul>
         * <li>A single port. When the origin server port is a single port, any valid edge port combination is supported.</li>
         * <li>A port range. The origin server port can be set to a port range only when the edge port is a port range, and the range size must be the same as the edge port range. For example, if the edge port is 90-93, you cannot set the origin server port to 81-85 because the origin server port range is 5 while the edge port range is 4, which are inconsistent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>The origin server type. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address.</li>
         * <li><strong>domain</strong>: domain name.</li>
         * <li><strong>OP</strong>: IPAM pool.</li>
         * <li><strong>LB</strong>: load balancing.</li>
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
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.2</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The status of the IP address. Valid values:</p>
         * <ul>
         * <li>healthy: Healthy.</li>
         * <li>unhealthy: Unhealthy.</li>
         * <li>unknown: The IP address is being prepared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
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
