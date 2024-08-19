// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocParserResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocParserResultResponseBody body;

    public static GetDocParserResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocParserResultResponse self = new GetDocParserResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocParserResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocParserResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocParserResultResponse setBody(GetDocParserResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocParserResultResponseBody getBody() {
        return this.body;
    }

}
