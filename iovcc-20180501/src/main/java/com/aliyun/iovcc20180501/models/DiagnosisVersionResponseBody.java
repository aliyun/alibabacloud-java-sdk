// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DiagnosisVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiagnosisResult")
    public String diagnosisResult;

    public static DiagnosisVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnosisVersionResponseBody self = new DiagnosisVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnosisVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiagnosisVersionResponseBody setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
        return this;
    }
    public String getDiagnosisResult() {
        return this.diagnosisResult;
    }

}
