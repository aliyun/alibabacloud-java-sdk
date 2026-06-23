// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>The diagnosis result code. Valid values:</p>
     * <ul>
     * <li>0: diagnosis completed.</li>
     * <li>1: diagnosis failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>The time when the diagnosis was initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The diagnosis ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6cf6b62e334e4583bdfd26707516****</p>
     */
    @NameInMap("diagnosis_id")
    public String diagnosisId;

    /**
     * <p>The time when the diagnosis was completed.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("finished")
    public String finished;

    /**
     * <p>The diagnosis status message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The diagnosis result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phase&quot;:5,&quot;version&quot;:&quot;20240101&quot;}</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <p>The diagnosis status. Valid values:</p>
     * <ul>
     * <li>0: diagnosis created.</li>
     * <li>1: diagnosis running.</li>
     * <li>2: diagnosis completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>The diagnosis target.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;cn-hongkong.10.0.0.246&quot;}</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The diagnosis type.</p>
     * 
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
