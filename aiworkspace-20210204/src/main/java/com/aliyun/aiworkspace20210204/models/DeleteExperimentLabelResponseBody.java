// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteExperimentLabelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExperimentLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentLabelResponseBody self = new DeleteExperimentLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
