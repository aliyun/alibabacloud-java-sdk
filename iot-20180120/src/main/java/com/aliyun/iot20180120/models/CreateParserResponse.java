// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateParserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateParserResponseBody body;

    public static CreateParserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParserResponse self = new CreateParserResponse();
        return TeaModel.build(map, self);
    }

    public CreateParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParserResponse setBody(CreateParserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParserResponseBody getBody() {
        return this.body;
    }

}
