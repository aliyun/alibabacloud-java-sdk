// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <br>
     * <p>*   true: The operation is successful.</p>
     * <p>*   false: The operation fails.</p>
     */
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
