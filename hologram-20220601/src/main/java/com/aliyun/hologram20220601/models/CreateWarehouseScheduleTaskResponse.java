// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class CreateWarehouseScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarehouseScheduleTaskResponseBody body;

    public static CreateWarehouseScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseScheduleTaskResponse self = new CreateWarehouseScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarehouseScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarehouseScheduleTaskResponse setBody(CreateWarehouseScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarehouseScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
