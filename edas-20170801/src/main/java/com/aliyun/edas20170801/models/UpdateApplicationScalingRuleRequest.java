// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. Call the <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configuration of custom scaling behaviors. For more information about the data structure, see the example.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;scaleUp&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;0&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Pods&quot;,&quot;value&quot;:5,&quot;periodSeconds&quot;:15}]},&quot;scaleDown&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;300&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Percent&quot;,&quot;value&quot;:200,&quot;periodSeconds&quot;:15}]}}</p>
     */
    @NameInMap("ScalingBehaviour")
    public String scalingBehaviour;

    /**
     * <p>The status of the Auto Scaling policy.</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled</p>
     * </li>
     * <li><p><strong>false</strong>: disabled</p>
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
     * <p>The name of the Auto Scaling policy.</p>
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
     * <p>The trigger policy, which is a JSON string of a ScalingRuleTriggerDTO object. For more information about the format, see the Additional information about request parameters section.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingRuleTriggerDTO{......}</p>
     */
    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    /**
     * <p>The type of the Auto Scaling policy. Only the following type is supported:</p>
     * <ul>
     * <li>trigger: a trigger-based policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>trigger</p>
     */
    @NameInMap("ScalingRuleType")
    public String scalingRuleType;

    public static UpdateApplicationScalingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationScalingRuleRequest self = new UpdateApplicationScalingRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationScalingRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationScalingRuleRequest setScalingBehaviour(String scalingBehaviour) {
        this.scalingBehaviour = scalingBehaviour;
        return this;
    }
    public String getScalingBehaviour() {
        return this.scalingBehaviour;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleEnable(Boolean scalingRuleEnable) {
        this.scalingRuleEnable = scalingRuleEnable;
        return this;
    }
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleMetric(String scalingRuleMetric) {
        this.scalingRuleMetric = scalingRuleMetric;
        return this;
    }
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTimer(String scalingRuleTimer) {
        this.scalingRuleTimer = scalingRuleTimer;
        return this;
    }
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleTrigger(String scalingRuleTrigger) {
        this.scalingRuleTrigger = scalingRuleTrigger;
        return this;
    }
    public String getScalingRuleTrigger() {
        return this.scalingRuleTrigger;
    }

    public UpdateApplicationScalingRuleRequest setScalingRuleType(String scalingRuleType) {
        this.scalingRuleType = scalingRuleType;
        return this;
    }
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

}
