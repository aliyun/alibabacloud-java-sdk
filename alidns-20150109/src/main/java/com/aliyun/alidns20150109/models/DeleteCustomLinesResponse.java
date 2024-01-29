// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomLinesResponseBody body;

    public static DeleteCustomLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesResponse self = new DeleteCustomLinesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomLinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomLinesResponse setBody(DeleteCustomLinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomLinesResponseBody getBody() {
        return this.body;
    }

}
