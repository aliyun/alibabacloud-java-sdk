// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public Object data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkerResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResourceStatusResponseBody self = new UpdateWorkerResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResourceStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateWorkerResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
