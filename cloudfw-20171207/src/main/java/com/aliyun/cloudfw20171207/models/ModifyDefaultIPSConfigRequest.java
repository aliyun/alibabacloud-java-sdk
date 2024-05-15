// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDefaultIPSConfigRequest extends TeaModel {
    @NameInMap("AiRules")
    public String aiRules;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BasicRules")
    public String basicRules;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CtiRules")
    public String ctiRules;

    @NameInMap("EnableAllPatch")
    public String enableAllPatch;

    @NameInMap("EnableDefault")
    public String enableDefault;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PatchRules")
    public String patchRules;

    @NameInMap("RuleClass")
    public String ruleClass;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultIPSConfigRequest self = new ModifyDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultIPSConfigRequest setAiRules(String aiRules) {
        this.aiRules = aiRules;
        return this;
    }
    public String getAiRules() {
        return this.aiRules;
    }

    public ModifyDefaultIPSConfigRequest setBasicRules(String basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public String getBasicRules() {
        return this.basicRules;
    }

    public ModifyDefaultIPSConfigRequest setCtiRules(String ctiRules) {
        this.ctiRules = ctiRules;
        return this;
    }
    public String getCtiRules() {
        return this.ctiRules;
    }

    public ModifyDefaultIPSConfigRequest setEnableAllPatch(String enableAllPatch) {
        this.enableAllPatch = enableAllPatch;
        return this;
    }
    public String getEnableAllPatch() {
        return this.enableAllPatch;
    }

    public ModifyDefaultIPSConfigRequest setEnableDefault(String enableDefault) {
        this.enableDefault = enableDefault;
        return this;
    }
    public String getEnableDefault() {
        return this.enableDefault;
    }

    public ModifyDefaultIPSConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDefaultIPSConfigRequest setPatchRules(String patchRules) {
        this.patchRules = patchRules;
        return this;
    }
    public String getPatchRules() {
        return this.patchRules;
    }

    public ModifyDefaultIPSConfigRequest setRuleClass(String ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public String getRuleClass() {
        return this.ruleClass;
    }

    public ModifyDefaultIPSConfigRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public ModifyDefaultIPSConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
