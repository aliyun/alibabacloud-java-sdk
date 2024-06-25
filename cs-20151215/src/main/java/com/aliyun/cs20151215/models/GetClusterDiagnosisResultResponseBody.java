// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <strong>example:</strong>
     * <p>6cf6b62e334e4583bdfd26707516****</p>
     */
    @NameInMap("diagnosis_id")
    public String diagnosisId;

    /**
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("finished")
    public String finished;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>{&quot;phase&quot;:5,&quot;version&quot;:&quot;20240101&quot;}</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;cn-hongkong.10.0.0.246&quot;}</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <strong>example:</strong>
     * <p>Node</p>
     */
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
