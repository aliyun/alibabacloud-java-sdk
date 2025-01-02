// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether basic policies are enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BasicRules")
    public Integer basicRules;

    /**
     * <p>Indicates whether virtual patching is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableAllPatch")
    public Integer enableAllPatch;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125adf1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The level of the rule group for the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: loose.</li>
     * <li><strong>2</strong>: medium.</li>
     * <li><strong>3</strong>: strict.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleClass")
    public Integer ruleClass;

    /**
     * <p>The mode of the intrusion prevention system (IPS). Valid values:</p>
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

    public static DescribeVpcFirewallDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDefaultIPSConfigResponseBody self = new DescribeVpcFirewallDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setBasicRules(Integer basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public Integer getBasicRules() {
        return this.basicRules;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setEnableAllPatch(Integer enableAllPatch) {
        this.enableAllPatch = enableAllPatch;
        return this;
    }
    public Integer getEnableAllPatch() {
        return this.enableAllPatch;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setRuleClass(Integer ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public Integer getRuleClass() {
        return this.ruleClass;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setRunMode(Integer runMode) {
        this.runMode = runMode;
        return this;
    }
    public Integer getRunMode() {
        return this.runMode;
    }

}
