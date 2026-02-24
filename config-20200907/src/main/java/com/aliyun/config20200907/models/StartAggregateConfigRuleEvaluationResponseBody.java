// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static StartAggregateConfigRuleEvaluationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateConfigRuleEvaluationResponseBody self = new StartAggregateConfigRuleEvaluationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAggregateConfigRuleEvaluationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAggregateConfigRuleEvaluationResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
