// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessJsonFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetDetectProcessJsonFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectProcessJsonFileResponse setBody(GetDetectProcessJsonFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectProcessJsonFileResponseBody getBody() {
        return this.body;
    }

}
