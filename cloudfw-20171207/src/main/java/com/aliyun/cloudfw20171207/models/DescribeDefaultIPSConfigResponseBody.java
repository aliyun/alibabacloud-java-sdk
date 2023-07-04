// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDefaultIPSConfigResponseBody extends TeaModel {
    @NameInMap("AiRules")
    public Integer aiRules;

    @NameInMap("BasicRules")
    public Integer basicRules;

    @NameInMap("CtiRules")
    public Integer ctiRules;

    @NameInMap("EnableAllPatch")
    public Integer enableAllPatch;

    @NameInMap("EnableDefault")
    public Integer enableDefault;

    @NameInMap("PatchRules")
    public Integer patchRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleClass")
    public Integer ruleClass;

    @NameInMap("RunMode")
    public Integer runMode;

    public static DescribeDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultIPSConfigResponseBody self = new DescribeDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultIPSConfigResponseBody setAiRules(Integer aiRules) {
        this.aiRules = aiRules;
        return this;
    }
    public Integer getAiRules() {
        return this.aiRules;
    }

    public DescribeDefaultIPSConfigResponseBody setBasicRules(Integer basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public Integer getBasicRules() {
        return this.basicRules;
    }

    public DescribeDefaultIPSConfigResponseBody setCtiRules(Integer ctiRules) {
        this.ctiRules = ctiRules;
        return this;
    }
    public Integer getCtiRules() {
        return this.ctiRules;
    }

    public DescribeDefaultIPSConfigResponseBody setEnableAllPatch(Integer enableAllPatch) {
        this.enableAllPatch = enableAllPatch;
        return this;
    }
    public Integer getEnableAllPatch() {
        return this.enableAllPatch;
    }

    public DescribeDefaultIPSConfigResponseBody setEnableDefault(Integer enableDefault) {
        this.enableDefault = enableDefault;
        return this;
    }
    public Integer getEnableDefault() {
        return this.enableDefault;
    }

    public DescribeDefaultIPSConfigResponseBody setPatchRules(Integer patchRules) {
        this.patchRules = patchRules;
        return this;
    }
    public Integer getPatchRules() {
        return this.patchRules;
    }

    public DescribeDefaultIPSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefaultIPSConfigResponseBody setRuleClass(Integer ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public Integer getRuleClass() {
        return this.ruleClass;
    }

    public DescribeDefaultIPSConfigResponseBody setRunMode(Integer runMode) {
        this.runMode = runMode;
        return this;
    }
    public Integer getRunMode() {
        return this.runMode;
    }

}
