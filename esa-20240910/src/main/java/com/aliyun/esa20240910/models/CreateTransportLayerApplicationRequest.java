// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationRequest extends TeaModel {
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
     * <p>IP access rule switch. When enabled, the WAF\&quot;s IP access rules apply to the transport layer application.</p>
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
     * <p>off</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Domain name of the transport layer application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>List of forwarding rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateTransportLayerApplicationRequestRules> rules;

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
         * <p>Client IP pass-through protocol, supporting:</p>
         * <ul>
         * <li><strong>off</strong>: No pass-through.</li>
         * <li><strong>PPv1</strong>: PROXY Protocol v1, supports client IP pass-through for TCP protocol.</li>
         * <li><strong>PPv2</strong>: PROXY Protocol v2, supports client IP pass-through for TCP and UDP protocols.</li>
         * <li><strong>SPP</strong>: Simple Proxy Protocol, supports client IP pass-through for UDP protocol.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SPP</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <p>Comment information for the rule (optional).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Edge port. Supports:</p>
         * <ul>
         * <li>A single port, such as 80.</li>
         * <li>Port range, such as 81-85, representing ports 81, 82, 83, 84, and 85.</li>
         * <li>Combination of ports and port ranges, separated by commas, such as 80,81-85,90, representing ports 80, 81, 82, 83, 84, 85, and 90.</li>
         * </ul>
         * <p>Edge ports within a single rule and between multiple rules must not overlap.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Specific value of the origin, which needs to match the origin type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Origin port. Supports:</p>
         * <ul>
         * <li>A single port, when the origin port is a single port, any valid combination of edge ports is supported.</li>
         * <li>Port range, only when the edge port is a port range, the origin port can be set to a port range, and the size of the range must match that of the edge port. For example, if the edge port is 90-93, the origin port cannot be set to 81-85 because the origin port range is 5 and the edge port range is 3, which do not match.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <p>Origin type, supporting:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address.</li>
         * <li><strong>domain</strong>: Domain name.</li>
         * <li><strong>OP</strong>: Origin pool.</li>
         * <li><strong>LB</strong>: Load balancer.</li>
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
