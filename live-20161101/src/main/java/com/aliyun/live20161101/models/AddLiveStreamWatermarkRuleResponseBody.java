// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamWatermarkRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleId")
    public String ruleId;

    public static AddLiveStreamWatermarkRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamWatermarkRuleResponseBody self = new AddLiveStreamWatermarkRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamWatermarkRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLiveStreamWatermarkRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
