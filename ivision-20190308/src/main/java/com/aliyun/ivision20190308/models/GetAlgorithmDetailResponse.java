// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmDetailResponseBody body;

    public static GetAlgorithmDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailResponse self = new GetAlgorithmDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDetailResponse setBody(GetAlgorithmDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDetailResponseBody getBody() {
        return this.body;
    }

}
