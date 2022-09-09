// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteResourceExportTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static DeleteResourceExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceExportTaskResponseBody self = new DeleteResourceExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
