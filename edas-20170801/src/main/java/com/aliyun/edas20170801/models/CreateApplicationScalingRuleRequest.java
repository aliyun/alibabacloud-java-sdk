// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplicationlink</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Configure custom elastic behavior, refer to the example for specific data structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;scaleUp&quot;: {
     *             &quot;stabilizationWindowSeconds&quot;: &quot;0&quot;,
     *             &quot;selectPolicy&quot;: &quot;Max&quot;,
     *             &quot;policies&quot;: [
     *                   {
     *                         &quot;type&quot;: &quot;Pods&quot;,
     *                         &quot;value&quot;: 5,
     *                         &quot;periodSeconds&quot;: 15
     *                   }
     *             ]
     *       },
     *       &quot;scaleDown&quot;: {
     *             &quot;stabilizationWindowSeconds&quot;: &quot;300&quot;,
     *             &quot;selectPolicy&quot;: &quot;Max&quot;,
     *             &quot;policies&quot;: [
     *                   {
     *                         &quot;type&quot;: &quot;Percent&quot;,
     *                         &quot;value&quot;: 200,
     *                         &quot;periodSeconds&quot;: 15
     *                   }
     *             ]
     *       }
     * }</p>
     */
    @NameInMap("ScalingBehaviour")
    public String scalingBehaviour;

    /**
     * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the auto scaling policy.</li>
     * <li><strong>false</strong>: disables the auto scaling policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScalingRuleEnable")
    public Boolean scalingRuleEnable;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScalingRuleMetric")
    public String scalingRuleMetric;

    /**
     * <p>The name of the auto scaling policy. The name must start with a lowercase letter, and can contain lowercase letters, digits, and hyphens (-). The name must be 1 to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu-trigger</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScalingRuleTimer")
    public String scalingRuleTimer;

    /**
     * <p>The trigger policy for the auto scaling policy. Set the value in the JSON format by using the ScalingRuleTriggerDTO class. For more information, see Additional information about request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingRuleTriggerDTO{......}</p>
     */
    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    /**
     * <p>The type of the auto scaling policy. Set the value to <strong>trigger</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger</p>
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
