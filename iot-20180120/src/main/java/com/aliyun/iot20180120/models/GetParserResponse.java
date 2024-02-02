// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParserResponseBody body;

    public static GetParserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParserResponse self = new GetParserResponse();
        return TeaModel.build(map, self);
    }

    public GetParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParserResponse setBody(GetParserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParserResponseBody getBody() {
        return this.body;
    }

}
