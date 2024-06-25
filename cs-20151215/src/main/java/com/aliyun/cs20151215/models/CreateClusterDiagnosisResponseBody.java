// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterDiagnosisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>6f719f23098240818eb26fe3a37d****</p>
     */
    @NameInMap("diagnosis_id")
    public String diagnosisId;

    /**
     * <strong>example:</strong>
     * <p>687C5BAA-D103-4993-884B-C35E4314****</p>
     */
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
