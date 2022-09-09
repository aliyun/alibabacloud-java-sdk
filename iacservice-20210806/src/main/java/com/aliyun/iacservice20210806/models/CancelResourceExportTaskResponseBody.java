// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelResourceExportTaskResponseBody extends TeaModel {
    @NameInMap("exportTaskId")
    public String exportTaskId;

    @NameInMap("exportVersion")
    public String exportVersion;

    @NameInMap("requestId")
    public String requestId;

    public static CancelResourceExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelResourceExportTaskResponseBody self = new CancelResourceExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelResourceExportTaskResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public CancelResourceExportTaskResponseBody setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public CancelResourceExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
