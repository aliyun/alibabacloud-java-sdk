// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListViewsResponseBody body;

    public static ListViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListViewsResponse self = new ListViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListViewsResponse setBody(ListViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListViewsResponseBody getBody() {
        return this.body;
    }

}
