// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestServiceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestServiceInfoResponseBody body;

    public static RequestServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestServiceInfoResponse self = new RequestServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public RequestServiceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestServiceInfoResponse setBody(RequestServiceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestServiceInfoResponseBody getBody() {
        return this.body;
    }

}
