// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class SwitchSchedulerRuleRequest extends TeaModel {
    /**
     * <p>The name of the scheduling rule to manage.</p>
     * <br>
     * <p>> You can call the [DescribeSchedulerRules](https://help.aliyun.com/document_detail/157481.html) operation to query the names of all scheduling rules.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the scheduling rule. Valid values:</p>
     * <br>
     * <p>*   **2**: tiered protection rule</p>
     * <p>*   **3**: network acceleration rule</p>
     * <p>*   **5**: Alibaba Cloud CDN (CDN) interaction rule</p>
     * <p>*   **6**: cloud service interaction rule</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The configuration that is used to switch service traffic. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that includes the following parameters:</p>
     * <br>
     * <p>*   **Value**: required. The IP address of the associated resource. Data type: string.</p>
     * <br>
     * <p>*   **State**: required. The operation type. Data type: integer. Valid values:</p>
     * <br>
     * <p>    *   **0**: switches service traffic from the associated resource to your Anti-DDoS Pro or Anti-DDoS Premium instance for scrubbing.</p>
     * <p>    *   **1**: switches service traffic back to the associated cloud resource.</p>
     * <br>
     * <p>*   **Interval**: optional. The waiting time that is required before the service traffic is switched back. Unit: minutes. Data type: integer. Usage notes:</p>
     * <br>
     * <p>    *   If the **State** parameter is set to **0**, you must set this parameter to \\*\\*-1\\*\\*. Otherwise, the call fails.</p>
     * <p>    *   If the **State** parameter is set to **1**, you do not need to set this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
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
