// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateOperationEventScheduleTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOperationEventScheduleTimeResponseBody body;

    public static UpdateOperationEventScheduleTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperationEventScheduleTimeResponse self = new UpdateOperationEventScheduleTimeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOperationEventScheduleTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOperationEventScheduleTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOperationEventScheduleTimeResponse setBody(UpdateOperationEventScheduleTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOperationEventScheduleTimeResponseBody getBody() {
        return this.body;
    }

}
