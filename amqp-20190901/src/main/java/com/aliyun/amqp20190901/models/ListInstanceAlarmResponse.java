// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListInstanceAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceAlarmResponseBody body;

    public static ListInstanceAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAlarmResponse self = new ListInstanceAlarmResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceAlarmResponse setBody(ListInstanceAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceAlarmResponseBody getBody() {
        return this.body;
    }

}
