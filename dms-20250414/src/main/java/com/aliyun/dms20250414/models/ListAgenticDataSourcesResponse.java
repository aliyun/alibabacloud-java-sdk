// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticDataSourcesResponseBody body;

    public static ListAgenticDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticDataSourcesResponse self = new ListAgenticDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticDataSourcesResponse setBody(ListAgenticDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticDataSourcesResponseBody getBody() {
        return this.body;
    }

}
