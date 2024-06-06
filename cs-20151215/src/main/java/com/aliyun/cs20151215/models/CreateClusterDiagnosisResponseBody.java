// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterDiagnosisResponseBody extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("diagnosis_id")
    public String diagnosisId;

    @NameInMap("request_id")
    public String requestId;

    public static CreateClusterDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterDiagnosisResponseBody self = new CreateClusterDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterDiagnosisResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterDiagnosisResponseBody setDiagnosisId(String diagnosisId) {
        this.diagnosisId = diagnosisId;
        return this;
    }
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    public CreateClusterDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
