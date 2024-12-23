// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsDataSourcesResponseBody body;

    public static ListMmsDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDataSourcesResponse self = new ListMmsDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsDataSourcesResponse setBody(ListMmsDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsDataSourcesResponseBody getBody() {
        return this.body;
    }

}
