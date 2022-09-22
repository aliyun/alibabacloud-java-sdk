// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateDiagnosisOperateRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiagnosisOperateRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisOperateRecordsResponseBody self = new CreateDiagnosisOperateRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisOperateRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
