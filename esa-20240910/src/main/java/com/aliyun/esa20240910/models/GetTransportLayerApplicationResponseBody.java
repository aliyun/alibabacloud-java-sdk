// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <p>Specific value of the origin, which needs to match the type of the origin.</p>
     * 
     * <strong>example:</strong>
     * <p>17099311410****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Whether to enable China mainland network access optimization, default is off. Value range:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com.ialicdn.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>#/components/schemas/WafRuleMatch2</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Ipv6 switch</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Query Transport Layer Acceleration Application</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EB635996-1FD6-5DFD-BA57-27A849599940</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Edge port. Supports:</p>
     * <ul>
     * <li>A single port, such as 80.</li>
     * <li>Port range, such as 81-85, representing ports 81, 82, 83, 84, 85.</li>
     * <li>Combination of ports and port ranges, separated by commas, for example 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, 90.</li>
     * </ul>
     */
    @NameInMap("Rules")
    public java.util.List<GetTransportLayerApplicationResponseBodyRules> rules;

    /**
     * <p>Forwarding rule protocol, with values:</p>
     * <ul>
     * <li>TCP: TCP protocol.</li>
     * <li>UDP: UDP protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RulesCount")
    public Integer rulesCount;

    /**
     * <p>Details of the forwarding rule.</p>
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
         * <p>The domain name of the transport layer application.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>Switch for IP access rules. When turned on, the IP access rules in WAF take effect on the transport layer application.</p>
         * <ul>
         * <li>on: Turned on.</li>
         * <li>off: Turned off.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv6 switch.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Comment information of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>Client IP pass-through protocol, supporting:</p>
         * <ul>
         * <li><strong>off</strong>: No pass-through.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Status of the transport layer application</p>
         * <ul>
         * <li><strong>deploying</strong>: Deploying. In this state, modification and deletion are not allowed.</li>
         * <li><strong>active</strong>: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1234323***</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>Origin port. Supports:</p>
         * <ul>
         * <li>A single port, when the origin port is a single port, any valid edge port combination is supported.</li>
         * <li>Port range, only when the edge port is a port range, the origin port can be set as a port range and the size of the range must be consistent with the edge port. For example, if the edge port is 90-93, the origin port cannot be set to 81-85 because the origin port range is 5 and the edge port range is 3, which are inconsistent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CNAME domain corresponding to the transport layer acceleration application. This field is not empty only when the site is accessed via CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>Rule ID.</p>
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
