// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListListenersResponseBody body;

    public static ListListenersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponse self = new ListListenersResponse();
        return TeaModel.build(map, self);
    }

    public ListListenersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenersResponse setBody(ListListenersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenersResponseBody getBody() {
        return this.body;
    }

}
