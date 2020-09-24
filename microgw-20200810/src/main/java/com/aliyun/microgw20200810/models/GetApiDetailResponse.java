// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetApiDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApiDetailResponseBody body;

    public static GetApiDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiDetailResponse self = new GetApiDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetApiDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiDetailResponse setBody(GetApiDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiDetailResponseBody getBody() {
        return this.body;
    }

}
