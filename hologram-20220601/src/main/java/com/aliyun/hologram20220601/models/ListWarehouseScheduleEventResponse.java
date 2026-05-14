// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehouseScheduleEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWarehouseScheduleEventResponseBody body;

    public static ListWarehouseScheduleEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWarehouseScheduleEventResponse self = new ListWarehouseScheduleEventResponse();
        return TeaModel.build(map, self);
    }

    public ListWarehouseScheduleEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWarehouseScheduleEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWarehouseScheduleEventResponse setBody(ListWarehouseScheduleEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWarehouseScheduleEventResponseBody getBody() {
        return this.body;
    }

}
