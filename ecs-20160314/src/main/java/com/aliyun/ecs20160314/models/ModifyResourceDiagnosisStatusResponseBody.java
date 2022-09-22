// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyResourceDiagnosisStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourceDiagnosisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceDiagnosisStatusResponseBody self = new ModifyResourceDiagnosisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceDiagnosisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
