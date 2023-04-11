// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateImageBatchResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTranslateImageBatchResultResponseBody body;

    public static GetTranslateImageBatchResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateImageBatchResultResponse self = new GetTranslateImageBatchResultResponse();
        return TeaModel.build(map, self);
    }

    public GetTranslateImageBatchResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranslateImageBatchResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranslateImageBatchResultResponse setBody(GetTranslateImageBatchResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranslateImageBatchResultResponseBody getBody() {
        return this.body;
    }

}
