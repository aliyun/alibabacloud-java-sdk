// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelDetailResponseBody body;

    public static GetModelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailResponse self = new GetModelDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetModelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelDetailResponse setBody(GetModelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelDetailResponseBody getBody() {
        return this.body;
    }

}
