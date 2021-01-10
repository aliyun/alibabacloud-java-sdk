// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessJsonFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectProcessJsonFileResponseBody body;

    public static GetDetectProcessJsonFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessJsonFileResponse self = new GetDetectProcessJsonFileResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessJsonFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectProcessJsonFileResponse setBody(GetDetectProcessJsonFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectProcessJsonFileResponseBody getBody() {
        return this.body;
    }

}
