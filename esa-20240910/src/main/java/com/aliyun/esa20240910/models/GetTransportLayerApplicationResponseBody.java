// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17099311410****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <strong>example:</strong>
     * <p>example.com.ialicdn.com</p>
     */
    @NameInMap("Cname")
    public String cname;

    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    @NameInMap("Ipv6")
    public String ipv6;

    /**
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

    @NameInMap("Rules")
    public java.util.List<GetTransportLayerApplicationResponseBodyRules> rules;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RulesCount")
    public Integer rulesCount;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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

    public GetTransportLayerApplicationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetTransportLayerApplicationResponseBodyRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientIPPassThroughMode")
        public String clientIPPassThroughMode;

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
         * <p>1234323***</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

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

}
