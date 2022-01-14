// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacTinyAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsacTinyAppInfoResponseBody body;

    public static GetMsacTinyAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsacTinyAppInfoResponse self = new GetMsacTinyAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMsacTinyAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsacTinyAppInfoResponse setBody(GetMsacTinyAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsacTinyAppInfoResponseBody getBody() {
        return this.body;
    }

}
