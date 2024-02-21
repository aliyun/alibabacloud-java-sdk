// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApmResponseBody body;

    public static ListApmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApmResponse self = new ListApmResponse();
        return TeaModel.build(map, self);
    }

    public ListApmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApmResponse setBody(ListApmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApmResponseBody getBody() {
        return this.body;
    }

}
