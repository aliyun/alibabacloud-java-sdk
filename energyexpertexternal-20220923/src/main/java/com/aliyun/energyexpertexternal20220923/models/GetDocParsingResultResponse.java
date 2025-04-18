// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocParsingResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocParsingResultResponseBody body;

    public static GetDocParsingResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocParsingResultResponse self = new GetDocParsingResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocParsingResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocParsingResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocParsingResultResponse setBody(GetDocParsingResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocParsingResultResponseBody getBody() {
        return this.body;
    }

}
