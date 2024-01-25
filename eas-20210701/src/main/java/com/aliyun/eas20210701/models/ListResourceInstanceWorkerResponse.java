// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceInstanceWorkerResponseBody body;

    public static ListResourceInstanceWorkerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstanceWorkerResponse self = new ListResourceInstanceWorkerResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceInstanceWorkerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceInstanceWorkerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceInstanceWorkerResponse setBody(ListResourceInstanceWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceInstanceWorkerResponseBody getBody() {
        return this.body;
    }

}
