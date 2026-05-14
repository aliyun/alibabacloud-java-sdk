// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteWarehouseScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWarehouseScheduleTaskResponseBody body;

    public static DeleteWarehouseScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarehouseScheduleTaskResponse self = new DeleteWarehouseScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWarehouseScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWarehouseScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWarehouseScheduleTaskResponse setBody(DeleteWarehouseScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWarehouseScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
