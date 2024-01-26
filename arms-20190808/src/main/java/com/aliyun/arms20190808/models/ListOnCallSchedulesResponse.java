// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListOnCallSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOnCallSchedulesResponseBody body;

    public static ListOnCallSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnCallSchedulesResponse self = new ListOnCallSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public ListOnCallSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnCallSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnCallSchedulesResponse setBody(ListOnCallSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnCallSchedulesResponseBody getBody() {
        return this.body;
    }

}
