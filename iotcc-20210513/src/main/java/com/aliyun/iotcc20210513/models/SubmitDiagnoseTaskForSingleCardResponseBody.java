// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardResponseBody extends TeaModel {
    @NameInMap("DiagnoseTaskId")
    public String diagnoseTaskId;

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
