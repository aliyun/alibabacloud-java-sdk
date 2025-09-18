// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>Transport layer application ID, which can be obtained by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Whether to enable China mainland network access optimization, default is disabled. Value range:</p>
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
     * <p>IP access rule switch. When enabled, the IP access rules in WAF will take effect on the transport layer application.</p>
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
     * <p>Forwarding rule list. Details of each rule. Except for the comment, all other parameters are required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
         * <p>Client IP pass-through protocol, supports:</p>
         * <ul>
         * <li><strong>off</strong>: No pass-through.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SPP</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>Comment information for the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Edge port. Supports:</p>
         * <ul>
         * <li>A single port, e.g., 80.</li>
         * <li>Port range, e.g., 81-85, representing ports 81, 82, 83, 84, 85.</li>
         * <li>Combination of ports and port ranges, separated by commas, e.g., 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, 90.</li>
         * <li>Edge ports within a single rule and between multiple rules must not overlap.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>Forwarding rule protocol, supports:</p>
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
         * <p>Specific value of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Source port. Supports:</p>
         * <ul>
         * <li>A single port, when the source port is a single port, any valid edge port combination is supported.</li>
         * <li>Port range, only when the edge port is a port range, the source port can be set as a port range, and the size of the range must match that of the edge port. For example, if the edge port is 90-93, the source port cannot be set to 81-85 because the source port range is 5 and the edge port range is 3, which do not match.</li>
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
         * <li><strong>ip</strong>: IP address.</li>
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
