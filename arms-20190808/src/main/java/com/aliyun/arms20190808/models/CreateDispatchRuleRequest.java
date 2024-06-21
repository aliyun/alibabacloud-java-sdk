// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateDispatchRuleRequest extends TeaModel {
    /**
     * <h2>Additional information about the <strong>DispatchRule</strong> parameter</h2>
     * <p><strong>JSON string example and description</strong></p>
     * <pre><code>
     * {
     *   &quot;system&quot;: false,        // Specifies whether the dispatch rule is editable. Valid values: true: not editable. false: editable. 
     *   &quot;ruleid&quot;: 10282,           // The ID of the dispatch rule. 
     *   &quot;name&quot;: &quot;Prometheus Alert&quot;,   // The name of the dispatch policy. 
     *   &quot;labelMatchExpressionGrid&quot;: {
     *     &quot;labelMatchExpressionGroups&quot;: [     // Sets the dispatch rule. 
     *       {
     *         &quot;labelMatchExpressions&quot;: [
     *           {
     *             &quot;key&quot;: &quot;_aliyun_arms_involvedObject_kind&quot;, // The key of the tag of the dispatch rule. For more information, see the next section. 
     *             &quot;value&quot;: &quot;app&quot;,                              // The value of the tag. 
     *             &quot;operator&quot;: &quot;eq&quot;                             // The operator used in the dispatch rule. Valid values: eq: equals to. re: matches a regular expression. 
     *           }
     *         ]
     *       }
     *     ]
     *   },
     *   &quot;dispatchType&quot;: &quot;CREATE_ALERT/DISCARD_ALERT&quot;,    // The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert. 
     *   &quot;isRecover&quot;: true,               // Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert. 
     *   &quot;groupRules&quot;: [                  // Sets the event group. 
     *     {
     *       &quot;groupId&quot;: 1,               // The ID of the group. 
     *       &quot;groupingFields&quot;: [         // The fields that are used to group events. Events with the same field content are assigned to a group. Alerts with the same specified grouping field are sent to the handler in separate notifications. 
     *         &quot;alertname&quot;
     *       ],
     *       &quot;groupWait&quot;: 10,                 // The duration for which the system waits after the first alert is sent. After the duration, all alerts are sent in a single notification to the handler. 
     *       &quot;groupInterval&quot;: 15,             // The grouping interval. During the silence period of repeated alerts, if new alerts are generated, they will be sent after the group waiting time. 
     *       &quot;repeatInterval&quot;: 20             // The silence period of repeated alerts. All alerts are repeatedly sent at specified intervals until the alerts are cleared. 
     *     }
     *   ],
     *   &quot;notifyRules&quot;: [            // Sets the notification rule. 
     *     {
     *       &quot;notifyObjects&quot;: [
     *         {
     *           &quot;notifyType&quot;: &quot;ARMS_CONTACT&quot;,     // The type of the alert contact. Valid values: ARMS_CONTACT: contact. ARMS_CONTACT_GROUP: contact group. 
     *           &quot;name&quot;: &quot;JohnDoe&quot;,                // The name of the contact or contact group. 
     *           &quot;notifyObjectId&quot;: 1               // The ID of the contact or contact group. 
     *         },
     *         {
     *           &quot;notifyType&quot;: &quot;ARMS_CONTACT_GROUP&quot;,
     *           &quot;name&quot;: &quot;JohnDoe_group&quot;,
     *           &quot;notifyObjectId&quot;: 2
     *         }
     *       ],
     *       &quot;notifyChannels&quot;:[&quot;dingTalk&quot;,&quot;wechat&quot;,&quot;webhook&quot;,&quot;email&quot;]     // The notification method. Valid values: dingTalk, sms, webhook, email, and wechat. 
     *     },
     *   ],
     * }
     * </code></pre>
     * <p><strong>Enumerated keys of the tag of the dispatch rule</strong></p>
     * <ul>
     * <li><code>_aliyun_arms_userid</code>: user ID</li>
     * <li><code>_aliyun_arms_involvedObject_kind</code>: type of the associated object</li>
     * <li><code>_aliyun_arms_involvedObject_id</code>: ID of the associated object</li>
     * <li><code>_aliyun_arms_involvedObject_name</code>: name of the associated object</li>
     * <li><code>_aliyun_arms_alert_name</code>: alert name</li>
     * <li><code>_aliyun_arms_alert_rule_id</code>: alert rule ID</li>
     * <li><code>_aliyun_arms_alert_type</code>: alert type</li>
     * <li><code>_aliyun_arms_alert_level</code>: alert severity</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;system&quot;: false,   &quot;ruleid&quot;: 10282,   &quot;name&quot;: &quot;Prometheus Alert&quot;,   &quot;labelMatchExpressionGrid&quot;: {     &quot;labelMatchExpressionGroups&quot;: [       {         &quot;labelMatchExpressions&quot;: [           {             &quot;key&quot;: &quot;_aliyun_arms_involvedObject_kind&quot;,             &quot;value&quot;: &quot;app&quot;,             &quot;operator&quot;: &quot;eq&quot;           }         ]       }     ]   },   &quot;dispatchType&quot;: &quot;CREATE_ALERT/DISCARD_ALERT&quot;,   &quot;isRecover&quot;: true,   &quot;groupRules&quot;: [     {       &quot;groupId&quot;: 1,       &quot;groupingFields&quot;: [         &quot;alertname&quot;       ],       &quot;groupWait&quot;: 10,       &quot;groupInterval&quot;: 15,       &quot;repeatInterval&quot;: 20     }   ],   &quot;notifyRules&quot;: [     {       &quot;notifyObjects&quot;: [         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT&quot;,           &quot;name&quot;: &quot;JohnDoe&quot;,           &quot;notifyObjectId&quot;: 1         },         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT_GROUP&quot;,           &quot;name&quot;: &quot;JohnDoe_group&quot;,           &quot;notifyObjectId&quot;: 2         }       ],       &quot;notifyChannels&quot;:[&quot;dingTalk&quot;,&quot;wechat&quot;,&quot;webhook&quot;,&quot;email&quot;]     },   ], }</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDispatchRuleRequest self = new CreateDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDispatchRuleRequest setDispatchRule(String dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    public CreateDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
