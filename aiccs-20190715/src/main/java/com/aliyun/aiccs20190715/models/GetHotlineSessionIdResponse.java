// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class GetHotlineSessionIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineSessionIdResponseBody body;

    public static GetHotlineSessionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineSessionIdResponse self = new GetHotlineSessionIdResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineSessionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineSessionIdResponse setBody(GetHotlineSessionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineSessionIdResponseBody getBody() {
        return this.body;
    }

}
