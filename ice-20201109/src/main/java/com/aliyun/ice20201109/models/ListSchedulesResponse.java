// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSchedulesResponseBody body;

    public static ListSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesResponse self = new ListSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public ListSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSchedulesResponse setBody(ListSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSchedulesResponseBody getBody() {
        return this.body;
    }

}
