// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTranslateResponseBody body;

    public static GetBatchTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTranslateResponse self = new GetBatchTranslateResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTranslateResponse setBody(GetBatchTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTranslateResponseBody getBody() {
        return this.body;
    }

}
