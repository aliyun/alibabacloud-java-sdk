// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DetachDataQualityRulesFromEvaluationTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DetachDataQualityRulesFromEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDataQualityRulesFromEvaluationTaskResponseBody self = new DetachDataQualityRulesFromEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDataQualityRulesFromEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachDataQualityRulesFromEvaluationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
