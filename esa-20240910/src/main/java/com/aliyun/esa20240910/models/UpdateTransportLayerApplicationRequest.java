// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>The Layer 4 application ID. You can call the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> operation to obtain the application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Specifies whether to enable network access optimization for the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>The IP access rule switch. When enabled, WAF IP access rules take effect for the Layer 4 application. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
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
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
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
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The list of forwarding rules. For each rule, all parameters except the comment are required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to enable static IP. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
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
         * <p>The client IP pass-through protocol. Valid values:</p>
         * <ul>
         * <li><strong>off</strong>: disabled.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, which supports client IP pass-through for TCP.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, which supports client IP pass-through for TCP and UDP.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, which supports client IP pass-through for UDP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SPP</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>The comment for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The edge port. Valid values:</p>
         * <ul>
         * <li>A single port, such as 80.</li>
         * <li>A port range, such as 81-85, which represents ports 81, 82, 83, 84, and 85.</li>
         * <li>A combination of ports and port ranges separated by commas, such as 80,81-85,90, which represents ports 80, 81, 82, 83, 84, 85, and 90.</li>
         * <li>Edge ports within a single rule and across multiple rules cannot overlap.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>The forwarding rule protocol. Valid values:</p>
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
         * <p>The specific value of the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Origin Server Port. Valid values:</p>
         * <ul>
         * <li>A single port. When Origin Server Port is a single port, any valid edge port combination is supported.</li>
         * <li>A port range. Origin Server Port can be set to a port range only when the edge port is a port range, and the range size must match the edge port range. For example, if the edge port is 90-93, you cannot set Origin Server Port to 81-85 because Origin Server Port range is 5 while the edge port range is 4, which are inconsistent.</li>
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
         * <li><strong>ip</strong>: IP address.</li>
         * <li><strong>domain</strong>: domain name.</li>
         * <li><strong>OP</strong>: origin IPAM pool.</li>
         * <li><strong>LB</strong>: load balancing.</li>
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
