// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AttachDataQualityRulesToEvaluationTaskResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD8-4870-A6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the association is as follows:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: the call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AttachDataQualityRulesToEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDataQualityRulesToEvaluationTaskResponseBody self = new AttachDataQualityRulesToEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDataQualityRulesToEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachDataQualityRulesToEvaluationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
