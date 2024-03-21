// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosSpecInfoResponseBody extends TeaModel {
    /**
     * <p>The bandwidth limit of a single instance.</p>
     */
    @NameInMap("BandwidthLimit")
    public String bandwidthLimit;

    /**
     * <p>The version. Valid values:</p>
     * <br>
     * <p>* **poc**: POC Edition</p>
     * <p>* **basic**: Basic Edition</p>
     * <p>* **insurance**: Insurance Edition</p>
     * <p>* **unlimited**: Unlimited Edition</p>
     * <p>* **port_enhancement**: Special Port Enhanced Edition</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>Specifies whether to enable DDoS mitigation. Valid values:</p>
     * <br>
     * <p>*   **on:**</p>
     * <p>*   **off**.</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>Specifies whether custom ports are supported. Valid values:</p>
     * <br>
     * <p>*   **yes**</p>
     * <p>*   **no**</p>
     */
    @NameInMap("IsSpecialPort")
    public String isSpecialPort;

    /**
     * <p>Protected region. Valid values:</p>
     * <br>
     * <p>* **global**: global</p>
     * <p>* **chinese_mainland**: Chinese mainland</p>
     * <p>* **global_excluding_the_chinese_mainland**: outside the Chinese mainland</p>
     */
    @NameInMap("ProtectedArea")
    public String protectedArea;

    /**
     * <p>The QPS limit.</p>
     */
    @NameInMap("QpsLimit")
    public String qpsLimit;

    /**
     * <p>The ID of the request.</p>
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
         * <br>
         * <p>*   **total_defense_num**: the total number of mitigation sessions of the version.</p>
         * <p>*   **consume_defense_num**: the number of used mitigation sessions of the version.</p>
         * <p>*   **max_domain_num**: the limit on the number of added domain names.</p>
         * <p>*   **emain_domain_num**: the number of added domain names.</p>
         * <p>*   **defence_package_num**: the total number of purchased additional mitigation sessions.</p>
         * <p>*   **consume_defence_package_num**: the number of used additional mitigation sessions.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The configuration expression of the version rule.</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <p>The value of the configuration expression of the version rule.</p>
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
         * <br>
         * <p>*   **version_defense_num**: the rule for the number of version mitigation sessions</p>
         * <p>*   **domain_num**: the rule for the limit on the number of domain names</p>
         * <p>*   **defence_package_num**: the rule for extra mitigation session plans</p>
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
