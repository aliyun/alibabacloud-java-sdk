// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppResponseBody extends TeaModel {
    // The response in JSON format, including the HTTP status code, error code, response message, and trace ID.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTraceAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppResponseBody self = new DeleteTraceAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteTraceAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
