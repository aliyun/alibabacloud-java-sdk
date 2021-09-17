// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetActivityGameInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetActivityGameInfoResponseBody body;

    public static GetActivityGameInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActivityGameInfoResponse self = new GetActivityGameInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetActivityGameInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActivityGameInfoResponse setBody(GetActivityGameInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActivityGameInfoResponseBody getBody() {
        return this.body;
    }

}
