// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleRequest extends TeaModel {
    /**
     * <p>The details of the CDN interaction rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
     * <br>
     * <p>*   **ParamType**: the type of the scheduling rule. This field is required and must be of the string type. Set the value to **cdn**. This indicates that you want to modify a CDN interaction rule.</p>
     * <br>
     * <p>*   **ParamData**: the values of parameters that you want to modify for the CDN interaction rule. This field is required and must be of the map type. ParamData contains the following parameters:</p>
     * <br>
     * <p>    *   **Domain**: the accelerated domain in CDN. This parameter is required and must be of the string type.</p>
     * <p>    *   **Cname**: the CNAME that is assigned to the accelerated domain. This parameter is required and must be of the string type.</p>
     * <p>    *   **AccessQps**: the queries per second (QPS) threshold that is used to switch service traffic to Anti-DDoS Pro or Anti-DDoS Premium. This parameter is required and must be of the integer type.</p>
     * <p>    *   **UpstreamQps**: the QPS threshold that is used to switch service traffic to CDN. This parameter is optional and must be of the integer type.</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the custom defense rule. Valid values:</p>
     * <br>
     * <p>*   **2**: tiered protection</p>
     * <p>*   **3**: network acceleration</p>
     * <p>*   **5**: CDN interaction</p>
     * <p>*   **6**: cloud service interaction</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The details of the scheduling rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
     * <br>
     * <p>*   **Type**: the address type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type. Valid values:</p>
     * <br>
     * <p>    *   **A**: IP address</p>
     * <p>    *   **CNAME**: domain name</p>
     * <br>
     * <p>*   **Value**: the address of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type.</p>
     * <br>
     * <p>*   **Priority**: the priority of the scheduling rule. This field is required and must be of the integer type. Valid values: **0** to **100**. A larger value indicates a higher priority.</p>
     * <br>
     * <p>*   **ValueType**: the type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the integer type. Valid values:</p>
     * <br>
     * <p>    *   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</p>
     * <p>    *   **2**: the IP address of the interaction resource in the tiered protection scenario</p>
     * <p>    *   **3**: the IP address that is used to accelerate access in the network acceleration scenario</p>
     * <p>    *   **5**: the domain name that is configured in Alibaba Cloud CDN (CDN) in the CDN interaction scenario</p>
     * <p>    *   **6** the IP address of the interaction resource in the cloud service interaction scenario</p>
     * <br>
     * <p>*   **RegionId**: the region where the interaction resource is deployed. This parameter must be specified when **ValueType** is set to **2**. The value must be of the string type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static CreateSchedulerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerRuleRequest self = new CreateSchedulerRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerRuleRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateSchedulerRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSchedulerRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateSchedulerRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public CreateSchedulerRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
