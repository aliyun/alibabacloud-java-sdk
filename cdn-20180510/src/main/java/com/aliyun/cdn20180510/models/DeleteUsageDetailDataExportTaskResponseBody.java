// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUsageDetailDataExportTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUsageDetailDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsageDetailDataExportTaskResponseBody self = new DeleteUsageDetailDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUsageDetailDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
