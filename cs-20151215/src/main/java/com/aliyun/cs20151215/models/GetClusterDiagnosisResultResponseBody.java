// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("created")
    public String created;

    @NameInMap("diagnosis_id")
    public String diagnosisId;

    @NameInMap("finished")
    public String finished;

    @NameInMap("message")
    public String message;

    @NameInMap("result")
    public String result;

    @NameInMap("status")
    public Long status;

    @NameInMap("target")
    public String target;

    @NameInMap("type")
    public String type;

    public static GetClusterDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisResultResponseBody self = new GetClusterDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetClusterDiagnosisResultResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public GetClusterDiagnosisResultResponseBody setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
        return this;
    }
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    public GetClusterDiagnosisResultResponseBody setFinished(String finished) {
        this.finished = finished;
        return this;
    }
    public String getFinished() {
        return this.finished;
    }

    public GetClusterDiagnosisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClusterDiagnosisResultResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetClusterDiagnosisResultResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetClusterDiagnosisResultResponseBody setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public GetClusterDiagnosisResultResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
