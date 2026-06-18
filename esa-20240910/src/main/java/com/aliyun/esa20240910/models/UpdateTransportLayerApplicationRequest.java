// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>The transport layer application ID. You can obtain this ID by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Specifies whether to enable cross-border optimization for network access from the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p>on: Enables the feature.</p>
     * </li>
     * <li><p>off: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>Specifies whether to enable IP access rules. If enabled, the IP access rules in WAF apply to the transport layer application. Valid values:</p>
     * <ul>
     * <li><p>on: Enables the feature.</p>
     * </li>
     * <li><p>off: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Specifies whether to enable IPv6. Valid values: <code>on</code> and <code>off</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>A list of forwarding rules. For each rule, all parameters are required except for <code>Comment</code>.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("StaticIp")
    public String staticIp;

    public static UpdateTransportLayerApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransportLayerApplicationRequest self = new UpdateTransportLayerApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransportLayerApplicationRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public UpdateTransportLayerApplicationRequest setCrossBorderOptimization(String crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public UpdateTransportLayerApplicationRequest setIpAccessRule(String ipAccessRule) {
        this.ipAccessRule = ipAccessRule;
        return this;
    }
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    public UpdateTransportLayerApplicationRequest setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public String getIpv6() {
        return this.ipv6;
    }

    public UpdateTransportLayerApplicationRequest setKeepAliveProtection(String keepAliveProtection) {
        this.keepAliveProtection = keepAliveProtection;
        return this;
    }
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    public UpdateTransportLayerApplicationRequest setRules(java.util.List<UpdateTransportLayerApplicationRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateTransportLayerApplicationRequestRules> getRules() {
        return this.rules;
    }

    public UpdateTransportLayerApplicationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateTransportLayerApplicationRequest setStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }
    public String getStaticIp() {
        return this.staticIp;
    }

    public static class UpdateTransportLayerApplicationRequestRules extends TeaModel {
        /**
         * <p>Specifies the protocol for client IP pass-through. Valid values:</p>
         * <ul>
         * <li><p><strong>off</strong>: Disables client IP pass-through.</p>
         * </li>
         * <li><p><strong>PPv1</strong>: PROXY Protocol v1. Supports client IP pass-through for the TCP protocol.</p>
         * </li>
         * <li><p><strong>PPv2</strong>: PROXY Protocol v2. Supports client IP pass-through for both TCP and UDP protocols.</p>
         * </li>
         * <li><p><strong>SPP</strong>: Simple Proxy Protocol. Supports client IP pass-through for the UDP protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SPP</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>An optional comment for the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The edge port. The following formats are supported:</p>
         * <ul>
         * <li><p>A single port, for example, <code>80</code>.</p>
         * </li>
         * <li><p>A port range, for example, <code>81-85</code>. This range includes ports 81, 82, 83, 84, and 85.</p>
         * </li>
         * <li><p>A combination of ports and port ranges separated by commas, for example, <code>80,81-85,90</code>. This includes ports 80, 81, 82, 83, 84, 85, and 90.</p>
         * </li>
         * <li><p>Edge ports cannot overlap within a single rule or across multiple rules.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><p>TCP: Transmission Control Protocol.</p>
         * </li>
         * <li><p>UDP: User Datagram Protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The source, which must correspond to the specified <code>SourceType</code>. For example, if <code>SourceType</code> is <code>ip</code>, this parameter must be an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The source port. The following formats are supported:</p>
         * <ul>
         * <li><p>A single port. When a single source port is used, any valid format can be used for the edge port.</p>
         * </li>
         * <li><p>A port range. You can specify a port range for the source port only if the edge port is also a port range, and their sizes must match. For example, if <code>EdgePort</code> is <code>90-93</code>, you cannot set <code>SourcePort</code> to <code>81-85</code> because their sizes (4 and 5 ports, respectively) do not match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>The type of the source. Valid values:</p>
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

        public static UpdateTransportLayerApplicationRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransportLayerApplicationRequestRules self = new UpdateTransportLayerApplicationRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateTransportLayerApplicationRequestRules setClientIPPassThroughMode(String clientIPPassThroughMode) {
            this.clientIPPassThroughMode = clientIPPassThroughMode;
            return this;
        }
        public String getClientIPPassThroughMode() {
            return this.clientIPPassThroughMode;
        }

        public UpdateTransportLayerApplicationRequestRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateTransportLayerApplicationRequestRules setEdgePort(String edgePort) {
            this.edgePort = edgePort;
            return this;
        }
        public String getEdgePort() {
            return this.edgePort;
        }

        public UpdateTransportLayerApplicationRequestRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateTransportLayerApplicationRequestRules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateTransportLayerApplicationRequestRules setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public UpdateTransportLayerApplicationRequestRules setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
