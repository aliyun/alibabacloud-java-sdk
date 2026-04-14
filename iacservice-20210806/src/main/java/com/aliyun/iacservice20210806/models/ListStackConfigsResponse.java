// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStackConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackConfigsResponseBody body;

    public static ListStackConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackConfigsResponse self = new ListStackConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackConfigsResponse setBody(ListStackConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackConfigsResponseBody getBody() {
        return this.body;
    }

}
