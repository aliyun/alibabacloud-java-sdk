// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDefaultIPSConfigRequest extends TeaModel {
    /**
     * <p>The switch for basic policies. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enable.</p>
     * </li>
     * <li><p><strong>0</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BasicRules")
    public Integer basicRules;

    /**
     * <p>The switch for threat intelligence. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enable.</p>
     * </li>
     * <li><p><strong>0</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CtiRules")
    public Integer ctiRules;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The daily traffic limit for sensitive data detection.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxSdl")
    public Long maxSdl;

    /**
     * <p>The switch for virtual patching. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enable.</p>
     * </li>
     * <li><p><strong>0</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PatchRules")
    public Integer patchRules;

    /**
     * <p>The IPS rule group. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Loose rule group.</p>
     * </li>
     * <li><p><strong>2</strong>: Medium rule group.</p>
     * </li>
     * <li><p><strong>3</strong>: Strict rule group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleClass")
    public Integer ruleClass;

    /**
     * <p>The mode of the IPS. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Block Mode.</p>
     * </li>
     * <li><p><strong>0</strong>: Monitor Mode.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RunMode")
    public Integer runMode;

    public static ModifyDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultIPSConfigRequest self = new ModifyDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultIPSConfigRequest setBasicRules(Integer basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public Integer getBasicRules() {
        return this.basicRules;
    }

    public ModifyDefaultIPSConfigRequest setCtiRules(Integer ctiRules) {
        this.ctiRules = ctiRules;
        return this;
    }
    public Integer getCtiRules() {
        return this.ctiRules;
    }

    public ModifyDefaultIPSConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDefaultIPSConfigRequest setMaxSdl(Long maxSdl) {
        this.maxSdl = maxSdl;
        return this;
    }
    public Long getMaxSdl() {
        return this.maxSdl;
    }

    public ModifyDefaultIPSConfigRequest setPatchRules(Integer patchRules) {
        this.patchRules = patchRules;
        return this;
    }
    public Integer getPatchRules() {
        return this.patchRules;
    }

    public ModifyDefaultIPSConfigRequest setRuleClass(Integer ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public Integer getRuleClass() {
        return this.ruleClass;
    }

    public ModifyDefaultIPSConfigRequest setRunMode(Integer runMode) {
        this.runMode = runMode;
        return this;
    }
    public Integer getRunMode() {
        return this.runMode;
    }

}
