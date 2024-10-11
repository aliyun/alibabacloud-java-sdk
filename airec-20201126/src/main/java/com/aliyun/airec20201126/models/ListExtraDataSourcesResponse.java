// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListExtraDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExtraDataSourcesResponseBody body;

    public static ListExtraDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExtraDataSourcesResponse self = new ListExtraDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListExtraDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExtraDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExtraDataSourcesResponse setBody(ListExtraDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExtraDataSourcesResponseBody getBody() {
        return this.body;
    }

}
