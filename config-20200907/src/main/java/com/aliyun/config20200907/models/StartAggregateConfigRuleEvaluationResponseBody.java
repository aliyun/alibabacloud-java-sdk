// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC0FFF8-0B44-40C6-8BBF-3A185EFDD212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the involved resources were evaluated. Valid values:</p>
     * <ul>
     * <li>true: The involved resources were evaluated.</li>
     * <li>false: The involved resources were not evaluated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
