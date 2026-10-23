// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PostEmonTryAlarmRuleRequest extends TeaModel {
    /**
     * <p>The information about the test alert rule, notification method, and message recipients.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;alarmRuleName&quot;:&quot;test_rule&quot;,&quot;AlarmChannel&quot;:{&quot;phone&quot;:true,&quot;sms&quot;:true,&quot;dingWebHook&quot;:true},&quot;receivers&quot;:[{&quot;id&quot;:19,&quot;contactGroup&quot;:false}]}</p>
     */
    @NameInMap("body")
    public String body;

    public static PostEmonTryAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PostEmonTryAlarmRuleRequest self = new PostEmonTryAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public PostEmonTryAlarmRuleRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
