// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartParserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartParserResponseBody body;

    public static StartParserResponse build(java.util.Map<String, ?> map) throws Exception {
        StartParserResponse self = new StartParserResponse();
        return TeaModel.build(map, self);
    }

    public StartParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartParserResponse setBody(StartParserResponseBody body) {
        this.body = body;
        return this;
    }
    public StartParserResponseBody getBody() {
        return this.body;
    }

}
