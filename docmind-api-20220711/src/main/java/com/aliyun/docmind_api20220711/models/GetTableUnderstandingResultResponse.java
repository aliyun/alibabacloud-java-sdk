// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetTableUnderstandingResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableUnderstandingResultResponseBody body;

    public static GetTableUnderstandingResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableUnderstandingResultResponse self = new GetTableUnderstandingResultResponse();
        return TeaModel.build(map, self);
    }

    public GetTableUnderstandingResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableUnderstandingResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableUnderstandingResultResponse setBody(GetTableUnderstandingResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableUnderstandingResultResponseBody getBody() {
        return this.body;
    }

}
