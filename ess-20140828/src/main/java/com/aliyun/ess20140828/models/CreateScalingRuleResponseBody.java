// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingRuleResponseBody extends TeaModel {
    @NameInMap("ScalingRuleAri")
    public String scalingRuleAri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    public static CreateScalingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingRuleResponseBody self = new CreateScalingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingRuleResponseBody setScalingRuleAri(String scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
        return this;
    }
    public String getScalingRuleAri() {
        return this.scalingRuleAri;
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
