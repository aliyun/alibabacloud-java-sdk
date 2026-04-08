// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPADiagnosisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>diag-58d0750e8786919a</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    public static GetPADiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPADiagnosisTaskRequest self = new GetPADiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetPADiagnosisTaskRequest setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

}
