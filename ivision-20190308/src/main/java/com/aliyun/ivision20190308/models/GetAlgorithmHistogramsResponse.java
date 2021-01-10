// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmHistogramsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmHistogramsResponseBody body;

    public static GetAlgorithmHistogramsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmHistogramsResponse self = new GetAlgorithmHistogramsResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmHistogramsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmHistogramsResponse setBody(GetAlgorithmHistogramsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmHistogramsResponseBody getBody() {
        return this.body;
    }

}
