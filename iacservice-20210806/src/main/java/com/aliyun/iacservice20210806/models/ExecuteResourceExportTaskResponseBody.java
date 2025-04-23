// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteResourceExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ex-3b6cb9fa4751a6e645ad8365e6</p>
     */
    @NameInMap("exportTaskId")
    public String exportTaskId;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <strong>example:</strong>
     * <p>0B0A7C19-9077-5975-ACBD-DEE718787992</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExecuteResourceExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteResourceExportTaskResponseBody self = new ExecuteResourceExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteResourceExportTaskResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public ExecuteResourceExportTaskResponseBody setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public ExecuteResourceExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
