// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxbBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAxbBindFixedLineResponseBody body;

    public static DeleteAxbBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxbBindFixedLineResponse self = new DeleteAxbBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAxbBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAxbBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAxbBindFixedLineResponse setBody(DeleteAxbBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAxbBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
