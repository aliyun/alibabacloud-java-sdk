// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class SwitchSchedulerRuleRequest extends TeaModel {
    /**
     * <p>The name of the scheduling rule to manage.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157481.html">DescribeSchedulerRules</a> operation to query the names of all scheduling rules.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the scheduling rule. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: tiered protection rule</li>
     * <li><strong>3</strong>: network acceleration rule</li>
     * <li><strong>5</strong>: Alibaba Cloud CDN (CDN) interaction rule</li>
     * <li><strong>6</strong>: cloud service interaction rule</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The configuration that is used to switch service traffic. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that includes the following parameters:</p>
     * <ul>
     * <li><p><strong>Value</strong>: required. The IP address of the associated resource. Data type: string.</p>
     * </li>
     * <li><p><strong>State</strong>: required. The operation type. Data type: integer. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: switches service traffic from the associated resource to your Anti-DDoS Pro or Anti-DDoS Premium instance for scrubbing.</li>
     * <li><strong>1</strong>: switches service traffic back to the associated cloud resource.</li>
     * </ul>
     * </li>
     * <li><p><strong>Interval</strong>: optional. The waiting time that is required before the service traffic is switched back. Unit: minutes. Data type: integer. Usage notes:</p>
     * <ul>
     * <li>If the <strong>State</strong> parameter is set to <strong>0</strong>, you must set this parameter to \<em>\</em>-1\<em>\</em>. Otherwise, the call fails.</li>
     * <li>If the <strong>State</strong> parameter is set to <strong>1</strong>, you do not need to set this parameter.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Value&quot;:&quot;39.104.XX.XX&quot;,&quot;State&quot;:0,&quot;Interval&quot;:-1}]</p>
     */
    @NameInMap("SwitchData")
    public String switchData;

    public static SwitchSchedulerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchSchedulerRuleRequest self = new SwitchSchedulerRuleRequest();
        return TeaModel.build(map, self);
    }

    public SwitchSchedulerRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public SwitchSchedulerRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public SwitchSchedulerRuleRequest setSwitchData(String switchData) {
        this.switchData = switchData;
        return this;
    }
    public String getSwitchData() {
        return this.switchData;
    }

}
