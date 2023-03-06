// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDiagnosisSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: update successfully</p>
     * <p>*   false: update failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateDiagnosisSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiagnosisSettingsResponseBody self = new UpdateDiagnosisSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDiagnosisSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDiagnosisSettingsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
