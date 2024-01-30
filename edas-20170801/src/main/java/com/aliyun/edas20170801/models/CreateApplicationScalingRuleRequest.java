// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplicationlink](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Configure custom elastic behavior, refer to the example for specific data structure.</p>
     */
    @NameInMap("ScalingBehaviour")
    public String scalingBehaviour;

    /**
     * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the auto scaling policy.</p>
     * <p>*   **false**: disables the auto scaling policy.</p>
     */
    @NameInMap("ScalingRuleEnable")
    public Boolean scalingRuleEnable;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The name of the auto scaling policy. The name must start with a lowercase letter, and can contain lowercase letters, digits, and hyphens (-). The name must be 1 to 32 characters in length.</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

    /**
     * <p>The trigger policy for the auto scaling policy. Set the value in the JSON format by using the ScalingRuleTriggerDTO class. For more information, see Additional information about request parameters.</p>
     */
    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    /**
     * <p>The type of the auto scaling policy. Set the value to **trigger**.</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static CreateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationScalingRuleRequest self = new CreateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateApplicationScalingRuleRequest setScalingBehaviour(String scalingBehaviour) {
        this.scalingBehaviour = scalingBehaviour;
        return this;
    }
    public String getScalingBehaviour() {
        return this.scalingBehaviour;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleEnable(Boolean scalingRuleEnable) {
        this.scalingRuleEnable = scalingRuleEnable;
        return this;
    }
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleMetric(String scalingRuleMetric) {
        this.scalingRuleMetric = scalingRuleMetric;
        return this;
    }
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleTrigger(String scalingRuleTrigger) {
        this.scalingRuleTrigger = scalingRuleTrigger;
        return this;
    }
    public String getScalingRuleTrigger() {
        return this.scalingRuleTrigger;
    }

    public CreateApplicationScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
