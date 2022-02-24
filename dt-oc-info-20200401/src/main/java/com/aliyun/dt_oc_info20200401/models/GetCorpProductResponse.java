// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCorpProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCorpProductResponseBody body;

    public static GetCorpProductResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCorpProductResponse self = new GetCorpProductResponse();
        return TeaModel.build(map, self);
    }

    public GetCorpProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCorpProductResponse setBody(GetCorpProductResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCorpProductResponseBody getBody() {
        return this.body;
    }

}
