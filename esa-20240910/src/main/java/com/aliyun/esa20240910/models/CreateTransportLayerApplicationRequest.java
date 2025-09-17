// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationRequest extends TeaModel {
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<CreateTransportLayerApplicationRequestRules> rules;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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

    public static class CreateTransportLayerApplicationRequestRules extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TOA</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EdgePort")
        public String edgePort;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
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
