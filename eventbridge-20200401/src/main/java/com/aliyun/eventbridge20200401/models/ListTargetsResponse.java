// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTargetsResponseBody body;

    public static ListTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTargetsResponse self = new ListTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTargetsResponse setBody(ListTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTargetsResponseBody getBody() {
        return this.body;
    }

}
