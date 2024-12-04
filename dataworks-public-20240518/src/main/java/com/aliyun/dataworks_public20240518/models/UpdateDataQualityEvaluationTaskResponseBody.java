// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityEvaluationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataQualityEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityEvaluationTaskResponseBody self = new UpdateDataQualityEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataQualityEvaluationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
