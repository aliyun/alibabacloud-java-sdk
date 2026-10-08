// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The application ID. To get this ID, call the <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configuration for custom scaling behaviors. For more information about the data structure, see the example.</p>
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
     * <p>Specifies whether to enable the Auto Scaling rule.</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the rule.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the rule.</p>
     * </li>
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
     * <p>The name of the Auto Scaling rule. The name must start with a lowercase letter. It can contain lowercase letters, digits, and hyphens (-). The name must be 1 to 32 characters long.</p>
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
     * <p>The trigger policy. Set this parameter to a JSON string of the ScalingRuleTriggerDTO object. For more information about the format, see Additional information about request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingRuleTriggerDTO{......}</p>
     */
    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    /**
     * <p>The type of the Auto Scaling rule. Only the <strong>trigger</strong> type is supported.</p>
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
