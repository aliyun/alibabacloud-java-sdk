// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUserUsageDataExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserUsageDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserUsageDataExportTaskResponseBody self = new DeleteUserUsageDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserUsageDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
