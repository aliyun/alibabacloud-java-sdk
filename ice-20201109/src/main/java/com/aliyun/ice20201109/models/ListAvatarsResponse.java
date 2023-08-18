// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvatarsResponseBody body;

    public static ListAvatarsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarsResponse self = new ListAvatarsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvatarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvatarsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvatarsResponse setBody(ListAvatarsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvatarsResponseBody getBody() {
        return this.body;
    }

}
