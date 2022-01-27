// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncErrorRequestListByCodeResponseBody body;

    public static GetAsyncErrorRequestListByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestListByCodeResponse self = new GetAsyncErrorRequestListByCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestListByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncErrorRequestListByCodeResponse setBody(GetAsyncErrorRequestListByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncErrorRequestListByCodeResponseBody getBody() {
        return this.body;
    }

}
