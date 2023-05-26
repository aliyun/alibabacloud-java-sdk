// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateDispatchRuleRequest extends TeaModel {
    /**
     * <p>## Additional information about the **DispatchRule** parameter</p>
     * <br>
     * <p>**JSON string example and description**</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "id": 123,           // The ID of the dispatch policy. </p>
     * <p>  "system": false,        // Specifies whether the dispatch rule is editable. Valid values: true: not editable. false: editable. </p>
     * <p>  "ruleid": 10282,           // The ID of the dispatch rule. </p>
     * <p>  "name": "Prometheus Alert",   // The name of the dispatch policy. </p>
     * <p>  "labelMatchExpressionGrid": {</p>
     * <p>    "labelMatchExpressionGroups": [     // Sets the dispatch rule. </p>
     * <p>      {</p>
     * <p>        "labelMatchExpressions": [</p>
     * <p>          {</p>
     * <p>            "key": "_aliyun_arms_involvedObject_kind",   // The key of the tag of the dispatch rule. For more information, see the next section. </p>
     * <p>            "value": "app",                              // The value of the tag. </p>
     * <p>            "operator": "eq"                             // The operator used in the dispatch rule. Valid values: eq: equals to. re: matches a regular expression. </p>
     * <p>          }</p>
     * <p>        ]</p>
     * <p>      }</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  "dispatchType": "CREATE_ALERT/DISCARD_ALERT",    // The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.</p>
     * <p>  "isRecover": true,               // Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert. </p>
     * <p>  "groupRules": [                  // Sets the event group. </p>
     * <p>    {</p>
     * <p>      "groupId": 1,               // The ID of the group. </p>
     * <p>      "groupingFields": [         // The fields that are used to group events. Events with the same field content are assigned to a group. Alerts with the same specified grouping field are sent to the handler in separate notifications. </p>
     * <p>        "alertname"</p>
     * <p>      ],</p>
     * <p>      "groupWait": 10,                 // The duration for which the system waits after the first alert is sent. After the duration, all alerts are sent in a single notification to the handler. </p>
     * <p>      "groupInterval": 15,             // The grouping interval. During the silence period of repeated alerts, if new alerts are generated, they will be sent after the group waiting time. </p>
     * <p>      "repeatInterval": 20             // The silence period of repeated alerts. All alerts are repeatedly sent at specified intervals until the alerts are cleared. </p>
     * <p>    }</p>
     * <p>  ],</p>
     * <p>  "notifyRules": [            // Sets the notification rule. </p>
     * <p>    {</p>
     * <p>      "notifyObjects": [</p>
     * <p>        {</p>
     * <p>          "notifyType": "ARMS_CONTACT",     // The type of the alert contact. Valid values: ARMS_CONTACT: contact. ARMS_CONTACT_GROUP: contact group. </p>
     * <p>          "name": "JohnDoe",                // The name of the contact or contact group. </p>
     * <p>          "notifyObjectId": 1               // The ID of the contact or contact group. </p>
     * <p>        },</p>
     * <p>        {</p>
     * <p>          "notifyType": "ARMS_CONTACT_GROUP",</p>
     * <p>          "name": "JohnDoe_group",</p>
     * <p>          "notifyObjectId": 2</p>
     * <p>        }</p>
     * <p>      ],</p>
     * <p>      "notifyChannels":["dingTalk","wechat","webhook","email"]     // The notification method. Valid values: dingTalk, sms, webhook, email, and wechat. </p>
     * <p>    },</p>
     * <p>  ],</p>
     * <p>}</p>
     * <p>```</p>
     * <br>
     * <p>**Enumerated keys of the tag of the dispatch rule**</p>
     * <br>
     * <p>*   `_aliyun_arms_userid`: user ID</p>
     * <p>*   `_aliyun_arms_involvedObject_kind`: type of the associated object</p>
     * <p>*   `_aliyun_arms_involvedObject_id`: ID of the associated object</p>
     * <p>*   `_aliyun_arms_involvedObject_name`: name of the associated object</p>
     * <p>*   `_aliyun_arms_alert_name`: alert name</p>
     * <p>*   `_aliyun_arms_alert_rule_id`: alert rule ID</p>
     * <p>*   `_aliyun_arms_alert_type`: alert type</p>
     * <p>*   `_aliyun_arms_alert_level`: alert severity</p>
     */
    @NameInMap("DispatchRule")
    public String dispatchRule;

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
