// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListInstanceGraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceGraphResponseBody body;

    public static ListInstanceGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceGraphResponse self = new ListInstanceGraphResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceGraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceGraphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceGraphResponse setBody(ListInstanceGraphResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceGraphResponseBody getBody() {
        return this.body;
    }

}
