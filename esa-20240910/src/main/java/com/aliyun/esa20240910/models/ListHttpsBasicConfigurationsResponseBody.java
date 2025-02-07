// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpsBasicConfigurationsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListHttpsBasicConfigurationsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListHttpsBasicConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpsBasicConfigurationsResponseBody self = new ListHttpsBasicConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpsBasicConfigurationsResponseBody setConfigs(java.util.List<ListHttpsBasicConfigurationsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListHttpsBasicConfigurationsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListHttpsBasicConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpsBasicConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpsBasicConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHttpsBasicConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHttpsBasicConfigurationsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListHttpsBasicConfigurationsResponseBodyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
         */
        @NameInMap("Ciphersuite")
        public String ciphersuite;

        /**
         * <strong>example:</strong>
         * <p>strict</p>
         */
        @NameInMap("CiphersuiteGroup")
        public String ciphersuiteGroup;

        /**
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http3")
        public String http3;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Https")
        public String https;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OcspStapling")
        public String ocspStapling;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls10")
        public String tls10;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls11")
        public String tls11;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls12")
        public String tls12;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls13")
        public String tls13;

        public static ListHttpsBasicConfigurationsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListHttpsBasicConfigurationsResponseBodyConfigs self = new ListHttpsBasicConfigurationsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public ListHttpsBasicConfigurationsResponseBodyConfigs setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

}
