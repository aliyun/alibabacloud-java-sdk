// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>diagnoseTask-bp2n6rgaj49qcs34jyzo8</p>
     */
    @NameInMap("DiagnoseTaskId")
    public String diagnoseTaskId;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDiagnoseTaskForSingleCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDiagnoseTaskForSingleCardResponseBody self = new SubmitDiagnoseTaskForSingleCardResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDiagnoseTaskForSingleCardResponseBody setDiagnoseTaskId(String diagnoseTaskId) {
        this.diagnoseTaskId = diagnoseTaskId;
        return this;
    }
    public String getDiagnoseTaskId() {
        return this.diagnoseTaskId;
    }

    public SubmitDiagnoseTaskForSingleCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
