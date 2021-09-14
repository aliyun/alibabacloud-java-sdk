// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskResponseBody self = new UpdateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
