// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetRealPersonVerificationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRealPersonVerificationResultResponseBody body;

    public static GetRealPersonVerificationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealPersonVerificationResultResponse self = new GetRealPersonVerificationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetRealPersonVerificationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealPersonVerificationResultResponse setBody(GetRealPersonVerificationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealPersonVerificationResultResponseBody getBody() {
        return this.body;
    }

}
