// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteParserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParserResponseBody body;

    public static DeleteParserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParserResponse self = new DeleteParserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParserResponse setBody(DeleteParserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParserResponseBody getBody() {
        return this.body;
    }

}
