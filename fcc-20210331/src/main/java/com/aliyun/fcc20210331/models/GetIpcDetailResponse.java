// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetIpcDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpcDetailResponseBody body;

    public static GetIpcDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDetailResponse self = new GetIpcDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetIpcDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpcDetailResponse setBody(GetIpcDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpcDetailResponseBody getBody() {
        return this.body;
    }

}
