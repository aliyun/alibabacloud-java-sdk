// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceVersionsResponseBody body;

    public static ListServiceVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsResponse self = new ListServiceVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceVersionsResponse setBody(ListServiceVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceVersionsResponseBody getBody() {
        return this.body;
    }

}
