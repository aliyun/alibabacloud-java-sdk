// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafSpecInfoResponseBody extends TeaModel {
    /**
     * <p>The version of WAF.</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported types of protection policies and the configuration information of protection rules.</p>
     */
    @NameInMap("SpecInfos")
    public java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfos> specInfos;

    public static DescribeDcdnWafSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafSpecInfoResponseBody self = new DescribeDcdnWafSpecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafSpecInfoResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeDcdnWafSpecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafSpecInfoResponseBody setSpecInfos(java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfos> specInfos) {
        this.specInfos = specInfos;
        return this;
    }
    public java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfos> getSpecInfos() {
        return this.specInfos;
    }

    public static class DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs extends TeaModel {
        /**
         * <p>The configuration code of the protection rule.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The configuration expression of the protection rule.</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <p>The value of the configuration expression of the protection rule.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs self = new DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnWafSpecInfoResponseBodySpecInfos extends TeaModel {
        /**
         * <p>The configuration information of the protection rule.</p>
         */
        @NameInMap("Configs")
        public java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs> configs;

        /**
         * <p>The type of the protection policy. Valid values:</p>
         * <br>
         * <p>*   waf_group: basic web protection</p>
         * <p>*   custom_acl: custom</p>
         * <p>*   whitelist: whitelist</p>
         * <p>*   ip_blacklist: IP address blacklist</p>
         * <p>*   region_block: region blacklist</p>
         * <p>*   bot: bot management</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        public static DescribeDcdnWafSpecInfoResponseBodySpecInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafSpecInfoResponseBodySpecInfos self = new DescribeDcdnWafSpecInfoResponseBodySpecInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafSpecInfoResponseBodySpecInfos setConfigs(java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<DescribeDcdnWafSpecInfoResponseBodySpecInfosConfigs> getConfigs() {
            return this.configs;
        }

        public DescribeDcdnWafSpecInfoResponseBodySpecInfos setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

    }

}
