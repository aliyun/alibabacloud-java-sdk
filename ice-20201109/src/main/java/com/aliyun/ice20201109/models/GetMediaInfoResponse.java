// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaInfoResponseBody body;

    public static GetMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoResponse self = new GetMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaInfoResponse setBody(GetMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaInfoResponseBody getBody() {
        return this.body;
    }

}
