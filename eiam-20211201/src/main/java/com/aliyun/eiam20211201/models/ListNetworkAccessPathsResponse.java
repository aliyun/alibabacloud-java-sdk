// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessPathsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkAccessPathsResponseBody body;

    public static ListNetworkAccessPathsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessPathsResponse self = new ListNetworkAccessPathsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessPathsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkAccessPathsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkAccessPathsResponse setBody(ListNetworkAccessPathsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkAccessPathsResponseBody getBody() {
        return this.body;
    }

}
