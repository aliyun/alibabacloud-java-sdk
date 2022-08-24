// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosSpecInfoResponseBody extends TeaModel {
    @NameInMap("Edition")
    public String edition;

    @NameInMap("Enable")
    public String enable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecInfos")
    public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfos> specInfos;

    public static DescribeDcdnDdosSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosSpecInfoResponseBody self = new DescribeDcdnDdosSpecInfoResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Config")
        public String config;

        @NameInMap("Expr")
        public String expr;

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
        @NameInMap("Configs")
        public java.util.List<DescribeDcdnDdosSpecInfoResponseBodySpecInfosConfigs> configs;

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
