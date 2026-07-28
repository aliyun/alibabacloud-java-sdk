// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateResourceExportTaskResponseBody extends TeaModel {
    /**
     * <p>The resource export task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ex-4a1ec8b7003d24528326821be</p>
     */
    @NameInMap("exportTaskId")
    public String exportTaskId;

    /**
     * <p>The resource export version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("exportVersion")
    public String exportVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CFD8C2A8-5BE7-56D2-916D-64039B8E06E3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateResourceExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceExportTaskResponseBody self = new CreateResourceExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceExportTaskResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public CreateResourceExportTaskResponseBody setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public CreateResourceExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
