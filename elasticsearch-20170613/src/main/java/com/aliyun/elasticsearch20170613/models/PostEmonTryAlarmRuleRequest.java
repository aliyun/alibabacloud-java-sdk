// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PostEmonTryAlarmRuleRequest extends TeaModel {
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
