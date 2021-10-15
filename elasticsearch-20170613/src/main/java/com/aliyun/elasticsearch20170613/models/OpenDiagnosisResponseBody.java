// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenDiagnosisResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenDiagnosisResponseBody self = new OpenDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenDiagnosisResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public OpenDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
