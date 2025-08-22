// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateResourceExportTaskAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ex-kw161ol8te1n701e1igt8q8</p>
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
     * <p>B43F08A7-F2A3-54D3-BDA4-69C9F32A7B9F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateResourceExportTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceExportTaskAttributeResponseBody self = new UpdateResourceExportTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceExportTaskAttributeResponseBody setExportTaskId(String exportTaskId) {
        this.exportTaskId = exportTaskId;
        return this;
    }
    public String getExportTaskId() {
        return this.exportTaskId;
    }

    public UpdateResourceExportTaskAttributeResponseBody setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
        return this;
    }
    public String getExportVersion() {
        return this.exportVersion;
    }

    public UpdateResourceExportTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
