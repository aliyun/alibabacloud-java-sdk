// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAxnBindFixedLineResponseBody body;

    public static DeleteAxnBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnBindFixedLineResponse self = new DeleteAxnBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAxnBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAxnBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAxnBindFixedLineResponse setBody(DeleteAxnBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAxnBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
