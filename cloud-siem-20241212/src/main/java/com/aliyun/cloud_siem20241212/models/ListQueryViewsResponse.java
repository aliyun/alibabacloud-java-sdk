// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListQueryViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQueryViewsResponseBody body;

    public static ListQueryViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryViewsResponse self = new ListQueryViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueryViewsResponse setBody(ListQueryViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryViewsResponseBody getBody() {
        return this.body;
    }

}
