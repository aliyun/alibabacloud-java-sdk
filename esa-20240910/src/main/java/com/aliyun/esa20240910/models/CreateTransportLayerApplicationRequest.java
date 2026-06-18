// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>Enables or disables network optimization for access from the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the optimization.</p>
     * </li>
     * <li><p><code>off</code>: Disables the optimization.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>Applies IP access rules from Web Application Firewall (WAF) to this Transport Layer Application. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Enables or disables IPv6 support.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Enables or disables keep-alive protection.</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The domain name of the Transport Layer Application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The list of forwarding rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("StaticIp")
    public String staticIp;

    public static CreateTransportLayerApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransportLayerApplicationRequest self = new CreateTransportLayerApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransportLayerApplicationRequest setCrossBorderOptimization(String crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public CreateTransportLayerApplicationRequest setIpAccessRule(String ipAccessRule) {
        this.ipAccessRule = ipAccessRule;
        return this;
    }
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    public CreateTransportLayerApplicationRequest setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public String getIpv6() {
        return this.ipv6;
    }

    public CreateTransportLayerApplicationRequest setKeepAliveProtection(String keepAliveProtection) {
        this.keepAliveProtection = keepAliveProtection;
        return this;
    }
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    public CreateTransportLayerApplicationRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateTransportLayerApplicationRequest setRules(java.util.List<CreateTransportLayerApplicationRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateTransportLayerApplicationRequestRules> getRules() {
        return this.rules;
    }

    public CreateTransportLayerApplicationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateTransportLayerApplicationRequest setStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }
    public String getStaticIp() {
        return this.staticIp;
    }

    public static class CreateTransportLayerApplicationRequestRules extends TeaModel {
        /**
         * <p>The client IP passthrough protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Disables client IP passthrough.</p>
         * </li>
         * <li><p><strong>PPv1</strong>: PROXY Protocol v1. Preserves the client IP address for TCP connections.</p>
         * </li>
         * <li><p><strong>PPv2</strong>: PROXY Protocol v2. Preserves the client IP address for TCP and UDP connections.</p>
         * </li>
         * <li><p><strong>SPP</strong>: Simple Proxy Protocol. Preserves the client IP address for UDP connections.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPP</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>An optional comment for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The edge port. Supported formats:</p>
         * <ul>
         * <li><p>A single port, for example, <code>80</code>.</p>
         * </li>
         * <li><p>A port range, for example, <code>81-85</code>, which includes ports 81, 82, 83, 84, and 85.</p>
         * </li>
         * <li><p>A combination of ports and port ranges separated by commas, for example, <code>80,81-85,90</code>, which includes ports 80, 81, 82, 83, 84, 85, and 90.</p>
         * </li>
         * </ul>
         * <p>Edge ports cannot overlap within a single rule or across multiple rules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><p><code>TCP</code>: The TCP protocol.</p>
         * </li>
         * <li><p><code>UDP</code>: The UDP protocol.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The origin address. The value must match the specified <code>SourceType</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The origin port. Supported formats:</p>
         * <ul>
         * <li><p>A single port, which supports any valid combination of edge ports.</p>
         * </li>
         * <li><p>A port range. You can specify a port range only if the edge port is also a port range. The origin and edge port ranges must be the same size. For example, if the edge port range is <code>90-93</code> (4 ports), the origin port range cannot be <code>81-85</code> (5 ports).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static CreateTransportLayerApplicationRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTransportLayerApplicationRequestRules self = new CreateTransportLayerApplicationRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateTransportLayerApplicationRequestRules setClientIPPassThroughMode(String clientIPPassThroughMode) {
            this.clientIPPassThroughMode = clientIPPassThroughMode;
            return this;
        }
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        public CreateTransportLayerApplicationRequestRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateTransportLayerApplicationRequestRules setEdgePort(String edgePort) {
            this.edgePort = edgePort;
            return this;
        }
        public String getEdgePort() {
            return this.edgePort;
        }

        public CreateTransportLayerApplicationRequestRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateTransportLayerApplicationRequestRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateTransportLayerApplicationRequestRules setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public CreateTransportLayerApplicationRequestRules setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
