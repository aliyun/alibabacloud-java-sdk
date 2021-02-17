// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetMediaMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaMetaResponseBody body;

    public static GetMediaMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMetaResponse self = new GetMediaMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaMetaResponse setBody(GetMediaMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaMetaResponseBody getBody() {
        return this.body;
    }

}
