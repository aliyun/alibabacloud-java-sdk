// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteRamPolicyExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <strong>example:</strong>
     * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExecuteRamPolicyExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRamPolicyExportTaskResponseBody self = new ExecuteRamPolicyExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRamPolicyExportTaskResponseBody setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public ExecuteRamPolicyExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
