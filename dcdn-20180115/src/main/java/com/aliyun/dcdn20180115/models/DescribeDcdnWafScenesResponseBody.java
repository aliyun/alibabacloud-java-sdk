// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafScenesResponseBody extends TeaModel {
    @NameInMap("DefenseScenes")
    public java.util.List<DescribeDcdnWafScenesResponseBodyDefenseScenes> defenseScenes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafScenesResponseBody self = new DescribeDcdnWafScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafScenesResponseBody setDefenseScenes(java.util.List<DescribeDcdnWafScenesResponseBodyDefenseScenes> defenseScenes) {
        this.defenseScenes = defenseScenes;
        return this;
    }
    public java.util.List<DescribeDcdnWafScenesResponseBodyDefenseScenes> getDefenseScenes() {
        return this.defenseScenes;
    }

    public DescribeDcdnWafScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafScenesResponseBodyDefenseScenes extends TeaModel {
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("PolicyCount")
        public Integer policyCount;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static DescribeDcdnWafScenesResponseBodyDefenseScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafScenesResponseBodyDefenseScenes self = new DescribeDcdnWafScenesResponseBodyDefenseScenes();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafScenesResponseBodyDefenseScenes setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafScenesResponseBodyDefenseScenes setPolicyCount(Integer policyCount) {
            this.policyCount = policyCount;
            return this;
        }
        public Integer getPolicyCount() {
            return this.policyCount;
        }

        public DescribeDcdnWafScenesResponseBodyDefenseScenes setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

}
