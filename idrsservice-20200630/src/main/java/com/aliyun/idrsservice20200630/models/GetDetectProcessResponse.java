// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDetectProcessResponseBody body;

    public static GetDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessResponse self = new GetDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDetectProcessResponse setBody(GetDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDetectProcessResponseBody getBody() {
        return this.body;
    }

}
