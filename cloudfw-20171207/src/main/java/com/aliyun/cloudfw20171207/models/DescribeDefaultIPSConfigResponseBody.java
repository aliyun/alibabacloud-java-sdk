// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>The status of the basic policies feature. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: enabled</p>
     * </li>
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BasicRules")
    public Integer basicRules;

    /**
     * <p>The status of the threat intelligence feature. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: enabled</p>
     * </li>
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CtiRules")
    public Integer ctiRules;

    /**
     * <p>The maximum daily traffic that can be scanned for sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSdl")
    public Long maxSdl;

    /**
     * <p>The status of the virtual patching feature. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: enabled</p>
     * </li>
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PatchRules")
    public Integer patchRules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>133173B9-8010-5DF5-8B93-********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The strictness level of the intrusion prevention system (IPS) rules. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Loose</p>
     * </li>
     * <li><p><strong>2</strong>: Medium</p>
     * </li>
     * <li><p><strong>3</strong>: Strict</p>
     * </li>
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
     * <li><p><strong>1</strong>: Block Mode</p>
     * </li>
     * <li><p><strong>0</strong>: Monitor Mode</p>
     * </li>
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
