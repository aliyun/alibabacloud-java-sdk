// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationScalingRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The behavior of the auto scaling. See the example for the data structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;scaleUp&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;0&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Pods&quot;,&quot;value&quot;:5,&quot;periodSeconds&quot;:15}]},&quot;scaleDown&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;300&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Percent&quot;,&quot;value&quot;:200,&quot;periodSeconds&quot;:15}]}}</p>
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
     * <p>The name of the auto scaling policy.</p>
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
     * <p>The trigger policy for the auto scaling policy. Set this parameter in the JSON format by using the ScalingRuleTriggerDTO class. For more information, see Additional description of request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingRuleTriggerDTO{......}</p>
     */
    @NameInMap("ScalingRuleTrigger")
    public String scalingRuleTrigger;

    /**
     * <p>The type of the auto scaling policy.</p>
     * <ul>
     * <li>Set the value to trigger.</li>
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
