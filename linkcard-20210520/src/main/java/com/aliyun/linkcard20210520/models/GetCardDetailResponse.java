// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCardDetailResponseBody body;

    public static GetCardDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardDetailResponse self = new GetCardDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCardDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardDetailResponse setBody(GetCardDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardDetailResponseBody getBody() {
        return this.body;
    }

}
