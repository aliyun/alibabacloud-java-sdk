// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetCertifyResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCertifyResultResponseBody body;

    public static GetCertifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertifyResultResponse self = new GetCertifyResultResponse();
        return TeaModel.build(map, self);
    }

    public GetCertifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertifyResultResponse setBody(GetCertifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertifyResultResponseBody getBody() {
        return this.body;
    }

}
