// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelResourceExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ex-3b6cb9fa4751a6e5cdc6460282</p>
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
     * <p>136B3926-DD90-5DB2-96EC-8BAD6407D1C9</p>
     */
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
