// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateDispatchRuleRequest extends TeaModel {
    /**
     * <p>The dispatch rule configuration. The value is a JSON string. For more information about this parameter, see the following <strong>additional information about the DispatchRule parameter</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;id&quot;: 123,     &quot;system&quot;: false,   &quot;ruleid&quot;: 10282,   &quot;name&quot;: &quot;Prometheus Alert&quot;,   &quot;labelMatchExpressionGrid&quot;: {     &quot;labelMatchExpressionGroups&quot;: [       {         &quot;labelMatchExpressions&quot;: [           {             &quot;key&quot;: &quot;_aliyun_arms_involvedObject_kind&quot;,             &quot;value&quot;: &quot;app&quot;,             &quot;operator&quot;: &quot;eq&quot;           }         ]       }     ]   },   &quot;dispatchType&quot;: &quot;CREATE_ALERT/DISCARD_ALERT&quot;,   &quot;isRecover&quot;: true,   &quot;groupRules&quot;: [     {       &quot;groupId&quot;: 1,       &quot;groupingFields&quot;: [         &quot;alertname&quot;       ],       &quot;groupWait&quot;: 10,       &quot;groupInterval&quot;: 15,       &quot;repeatInterval&quot;: 20     }   ],   &quot;notifyRules&quot;: [     {       &quot;notifyObjects&quot;: [         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT&quot;,           &quot;name&quot;: &quot;JohnDoe&quot;,           &quot;notifyObjectId&quot;: 1         },         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT_GROUP&quot;,           &quot;name&quot;: &quot;JohnDoe_group&quot;,           &quot;notifyObjectId&quot;: 2         }       ],       &quot;notifyChannels&quot;:[&quot;dingTalk&quot;,&quot;wechat&quot;,&quot;webhook&quot;,&quot;email&quot;]     },   ], }</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDispatchRuleRequest self = new UpdateDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDispatchRuleRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public UpdateDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
