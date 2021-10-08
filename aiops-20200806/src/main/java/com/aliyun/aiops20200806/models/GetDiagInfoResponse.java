// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDiagInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDiagInfoResponseBody body;

    public static GetDiagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagInfoResponse self = new GetDiagInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDiagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDiagInfoResponse setBody(GetDiagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDiagInfoResponseBody getBody() {
        return this.body;
    }

}
