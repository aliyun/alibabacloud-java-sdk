// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCidInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCidInfoResponseBody body;

    public static GetCidInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCidInfoResponse self = new GetCidInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCidInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCidInfoResponse setBody(GetCidInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCidInfoResponseBody getBody() {
        return this.body;
    }

}
