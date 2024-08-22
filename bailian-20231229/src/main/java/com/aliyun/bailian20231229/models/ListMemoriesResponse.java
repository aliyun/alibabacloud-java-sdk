// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListMemoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoriesResponseBody body;

    public static ListMemoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoriesResponse self = new ListMemoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoriesResponse setBody(ListMemoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoriesResponseBody getBody() {
        return this.body;
    }

}
