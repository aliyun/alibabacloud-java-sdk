// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSecSpecInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecInfos")
    public java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfos> specInfos;

    @NameInMap("Version")
    public String version;

    public static DescribeDcdnSecSpecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSecSpecInfoResponseBody self = new DescribeDcdnSecSpecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSecSpecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnSecSpecInfoResponseBody setSpecInfos(java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfos> specInfos) {
        this.specInfos = specInfos;
        return this;
    }
    public java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfos> getSpecInfos() {
        return this.specInfos;
    }

    public DescribeDcdnSecSpecInfoResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Expr")
        public String expr;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs self = new DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDcdnSecSpecInfoResponseBodySpecInfos extends TeaModel {
        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleConfigs")
        public java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs> ruleConfigs;

        public static DescribeDcdnSecSpecInfoResponseBodySpecInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSecSpecInfoResponseBodySpecInfos self = new DescribeDcdnSecSpecInfoResponseBodySpecInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSecSpecInfoResponseBodySpecInfos setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public DescribeDcdnSecSpecInfoResponseBodySpecInfos setRuleConfigs(java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs> ruleConfigs) {
            this.ruleConfigs = ruleConfigs;
            return this;
        }
        public java.util.List<DescribeDcdnSecSpecInfoResponseBodySpecInfosRuleConfigs> getRuleConfigs() {
            return this.ruleConfigs;
        }

    }

}
