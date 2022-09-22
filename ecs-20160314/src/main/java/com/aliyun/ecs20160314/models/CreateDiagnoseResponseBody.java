// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDiagnoseResponseBody extends TeaModel {
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnoseResponseBody self = new CreateDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnoseResponseBody setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public CreateDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiagnoseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
