// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether basic protection is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BasicRules")
    public Integer basicRules;

    /**
     * <p>Indicates whether threat intelligence is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CtiRules")
    public Integer ctiRules;

    /**
     * <p>The maximum amount of traffic that can be processed by the sensitive data leak detection feature each day.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSdl")
    public Long maxSdl;

    /**
     * <p>Indicates whether virtual patching is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PatchRules")
    public Integer patchRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>133173B9-8010-5DF5-8B93-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The level of the rule group for the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: loose</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: strict</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RuleClass")
    public Integer ruleClass;

    /**
     * <p>The mode of the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: block mode</li>
     * <li><strong>0</strong>: monitor mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RunMode")
    public Integer runMode;

    public static DescribeDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultIPSConfigResponseBody self = new DescribeDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDefaultIPSConfigResponseBody setMaxSdl(Long maxSdl) {
        this.maxSdl = maxSdl;
        return this;
    }
    public Long getMaxSdl() {
        return this.maxSdl;
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
