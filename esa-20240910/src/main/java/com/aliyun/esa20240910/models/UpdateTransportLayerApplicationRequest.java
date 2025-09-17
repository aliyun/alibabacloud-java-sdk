// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    @NameInMap("Ipv6")
    public String ipv6;

    @NameInMap("Rules")
    public java.util.List<UpdateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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

    public static class UpdateTransportLayerApplicationRequestRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TOA</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
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
