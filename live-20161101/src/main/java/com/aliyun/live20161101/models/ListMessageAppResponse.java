// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageAppResponseBody body;

    public static ListMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAppResponse self = new ListMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageAppResponse setBody(ListMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageAppResponseBody getBody() {
        return this.body;
    }

}
