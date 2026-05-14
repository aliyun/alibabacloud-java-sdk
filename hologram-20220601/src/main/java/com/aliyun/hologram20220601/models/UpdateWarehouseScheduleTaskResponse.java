// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpdateWarehouseScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWarehouseScheduleTaskResponseBody body;

    public static UpdateWarehouseScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarehouseScheduleTaskResponse self = new UpdateWarehouseScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarehouseScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWarehouseScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWarehouseScheduleTaskResponse setBody(UpdateWarehouseScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWarehouseScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
