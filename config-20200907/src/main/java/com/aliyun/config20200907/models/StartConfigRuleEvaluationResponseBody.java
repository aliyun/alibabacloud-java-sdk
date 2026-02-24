// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartConfigRuleEvaluationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D31EEAD7-BF1E-5927-977A-AFF9342A7273</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request. Valid values:</p>
     * <ul>
     * <li><p>true: The request is successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StartConfigRuleEvaluationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartConfigRuleEvaluationResponseBody self = new StartConfigRuleEvaluationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartConfigRuleEvaluationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartConfigRuleEvaluationResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
