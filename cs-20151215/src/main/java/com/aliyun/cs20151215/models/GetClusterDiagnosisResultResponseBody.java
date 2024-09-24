// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>The code that indicates the diagnostic result. Valid values:</p>
     * <ul>
     * <li>0: the diagnostic is completed.</li>
     * <li>1: the diagnostic failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>The time when the diagnostic is initiated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The diagnostic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6cf6b62e334e4583bdfd26707516****</p>
     */
    @NameInMap("diagnosis_id")
    public String diagnosisId;

    /**
     * <p>The time when the diagnostic is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-28T11:29Z</p>
     */
    @NameInMap("finished")
    public String finished;

    /**
     * <p>The diagnostic status information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The diagnostic result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phase&quot;:5,&quot;version&quot;:&quot;20240101&quot;}</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <p>The status of the diagnostic. Valid values:</p>
     * <ul>
     * <li>0: The diagnostic is created.</li>
     * <li>1: The diagnostic is running.</li>
     * <li>2: The diagnostic is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("status")
    public Long status;

    /**
     * <p>The diagnostic object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;cn-hongkong.10.0.0.246&quot;}</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The type of the diagnostic.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>node</li>
     * <li>ingress</li>
     * <li>cluster</li>
     * <li>memory</li>
     * <li>pod</li>
     * <li>service</li>
     * <li>network</li>
     * </ul>
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
