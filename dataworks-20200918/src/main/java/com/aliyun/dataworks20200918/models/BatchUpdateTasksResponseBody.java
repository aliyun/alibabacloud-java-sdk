// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTasksResponseBody self = new BatchUpdateTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
