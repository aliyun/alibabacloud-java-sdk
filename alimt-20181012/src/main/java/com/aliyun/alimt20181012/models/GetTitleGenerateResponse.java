// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleGenerateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTitleGenerateResponseBody body;

    public static GetTitleGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTitleGenerateResponse self = new GetTitleGenerateResponse();
        return TeaModel.build(map, self);
    }

    public GetTitleGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTitleGenerateResponse setBody(GetTitleGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTitleGenerateResponseBody getBody() {
        return this.body;
    }

}
