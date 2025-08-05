// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListCheckersForProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckersForProjectResponseBody body;

    public static ListCheckersForProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckersForProjectResponse self = new ListCheckersForProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckersForProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckersForProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckersForProjectResponse setBody(ListCheckersForProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckersForProjectResponseBody getBody() {
        return this.body;
    }

}
