// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDefaultIPSConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable basic protection. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BasicRules")
    public String basicRules;

    /**
     * <p>Specifies whether to enable threat intelligence. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CtiRules")
    public String ctiRules;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxSdl")
    public Long maxSdl;

    /**
     * <p>Specifies whether to enable virtual patching. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PatchRules")
    public String patchRules;

    /**
     * <p>The level of the rule group for the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: loose</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: strict</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleClass")
    public String ruleClass;

    /**
     * <p>The mode of the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: block mode</li>
     * <li><strong>0</strong>: monitor mode</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    public static ModifyDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultIPSConfigRequest self = new ModifyDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
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

}
