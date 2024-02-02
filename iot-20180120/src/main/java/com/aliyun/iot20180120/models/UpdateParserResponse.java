// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateParserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateParserResponseBody body;

    public static UpdateParserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParserResponse self = new UpdateParserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateParserResponse setBody(UpdateParserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParserResponseBody getBody() {
        return this.body;
    }

}
