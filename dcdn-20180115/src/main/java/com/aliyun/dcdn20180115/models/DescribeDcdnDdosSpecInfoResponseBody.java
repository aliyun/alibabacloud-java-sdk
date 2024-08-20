// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosSpecInfoResponseBody extends TeaModel {
    /**
     * <p>The bandwidth limit of a single instance.</p>
     * 
     * <strong>example:</strong>
     * <p>40Gbps</p>
     */
    @NameInMap("BandwidthLimit")
    public String bandwidthLimit;

    /**
     * <p>The version. Valid values:</p>
     * <ul>
     * <li><strong>poc</strong>: POC Edition</li>
     * <li><strong>basic</strong>: Basic Edition</li>
     * <li><strong>insurance</strong>: Insurance Edition</li>
     * <li><strong>unlimited</strong>: Unlimited Edition</li>
     * <li><strong>port_enhancement</strong>: Special Port Enhanced Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>insurance</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>Specifies whether to enable DDoS mitigation. Valid values:</p>
     * <ul>
     * <li><strong>on:</strong></li>
     * <li><strong>off</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>Specifies whether custom ports are supported. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong></li>
     * <li><strong>no</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("IsSpecialPort")
    public String isSpecialPort;

    /**
     * <p>Protected region. Valid values:</p>
     * <ul>
     * <li><strong>global</strong>: global</li>
     * <li><strong>chinese_mainland</strong>: Chinese mainland</li>
     * <li><strong>global_excluding_the_chinese_mainland</strong>: outside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ProtectedArea")
    public String protectedArea;

    /**
     * <p>The QPS limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("QpsLimit")
    public String qpsLimit;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DEA8E7BE-33C6-56F5-AC56-74D50547CF34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code and configurations of the security rules.</p>
     */
    @NameInMap("SpecInfos")
    public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfos> specInfos;

    public static DescribeDcdnDdosSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosSpecInfoResponseBody self = new DescribeDcdnDdosSpecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDdosSpecInfoResponseBody setBandwidthLimit(String bandwidthLimit) {
        this.bandwidthLimit = bandwidthLimit;
        return this;
    }
    public String getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setIsSpecialPort(String isSpecialPort) {
        this.isSpecialPort = isSpecialPort;
        return this;
    }
    public String getIsSpecialPort() {
        return this.isSpecialPort;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setProtectedArea(String protectedArea) {
        this.protectedArea = protectedArea;
        return this;
    }
    public String getProtectedArea() {
        return this.protectedArea;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setQpsLimit(String qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }
    public String getQpsLimit() {
        return this.qpsLimit;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDdosSpecInfoResponseBody setSpecInfos(java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfos> specInfos) {
        this.specInfos = specInfos;
        return this;
    }
    public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfos> getSpecInfos() {
        return this.specInfos;
    }

    public static class DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs extends TeaModel {
        /**
         * <p>The configuration code of the version rule. Valid values:</p>
         * <ul>
         * <li><strong>total_defense_num</strong>: the total number of mitigation sessions of the version.</li>
         * <li><strong>consume_defense_num</strong>: the number of used mitigation sessions of the version.</li>
         * <li><strong>max_domain_num</strong>: the limit on the number of added domain names.</li>
         * <li><strong>emain_domain_num</strong>: the number of added domain names.</li>
         * <li><strong>defence_package_num</strong>: the total number of purchased additional mitigation sessions.</li>
         * <li><strong>consume_defence_package_num</strong>: the number of used additional mitigation sessions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>total_defense_num</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The configuration expression of the version rule.</p>
         * 
         * <strong>example:</strong>
         * <p>equal</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <p>The value of the configuration expression of the version rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs self = new DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnDdosSpecInfoResponseBodySpecInfos extends TeaModel {
        /**
         * <p>The configurations of the version rule.</p>
         */
        @NameInMap("Configs")
        public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs> configs;

        /**
         * <p>The version rule. Valid values:</p>
         * <ul>
         * <li><strong>version_defense_num</strong>: the rule for the number of version mitigation sessions</li>
         * <li><strong>domain_num</strong>: the rule for the limit on the number of domain names</li>
         * <li><strong>defence_package_num</strong>: the rule for extra mitigation session plans</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>version_defense_num</p>
         */
        @NameInMap("Rule")
        public String rule;

        public static DescribeDcdnDdosSpecInfoResponseBodySpecInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDdosSpecInfoResponseBodySpecInfos self = new DescribeDcdnDdosSpecInfoResponseBodySpecInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDdosSpecInfoResponseBodySpecInfos setConfigs(java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs> getConfigs() {
            return this.configs;
        }

        public DescribeDcdnDdosSpecInfoResponseBodySpecInfos setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

    }

}
