// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityEvaluationTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataQualityEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityEvaluationTaskResponseBody self = new DeleteDataQualityEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataQualityEvaluationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
