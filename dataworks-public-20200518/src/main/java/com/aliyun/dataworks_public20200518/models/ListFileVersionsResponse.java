// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileVersionsResponseBody body;

    public static ListFileVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileVersionsResponse self = new ListFileVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFileVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileVersionsResponse setBody(ListFileVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileVersionsResponseBody getBody() {
        return this.body;
    }

}
