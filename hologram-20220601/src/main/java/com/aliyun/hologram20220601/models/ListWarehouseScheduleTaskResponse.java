// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehouseScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarehouseScheduleTaskResponseBody body;

    public static ListWarehouseScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseScheduleTaskResponse self = new ListWarehouseScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListWarehouseScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarehouseScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarehouseScheduleTaskResponse setBody(ListWarehouseScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarehouseScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
