// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.indvi20190701.models;

import com.aliyun.tea.*;

public class GetDetectionResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDetectionResultResponseBody body;

    public static GetDetectionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResultResponse self = new GetDetectionResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectionResultResponse setBody(GetDetectionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectionResultResponseBody getBody() {
        return this.body;
    }

}
