// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    public static CreateScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleResponseBody self = new CreateScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScalingRuleResponseBody setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

}
