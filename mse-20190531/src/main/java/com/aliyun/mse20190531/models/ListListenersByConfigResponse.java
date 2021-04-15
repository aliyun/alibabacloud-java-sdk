// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListListenersByConfigResponseBody body;

    public static ListListenersByConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigResponse self = new ListListenersByConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenersByConfigResponse setBody(ListListenersByConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenersByConfigResponseBody getBody() {
        return this.body;
    }

}
