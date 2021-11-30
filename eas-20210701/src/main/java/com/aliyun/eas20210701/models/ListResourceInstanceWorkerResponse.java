// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListResourceInstanceWorkerResponse setBody(ListResourceInstanceWorkerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceInstanceWorkerResponseBody getBody() {
        return this.body;
    }

}
