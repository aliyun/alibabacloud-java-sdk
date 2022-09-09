// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteResourceExportTaskResponseBody extends TeaModel {
    @NameInMap("exportTaskId")
    public String exportTaskId;

    @NameInMap("exportVersion")
    public String exportVersion;

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
