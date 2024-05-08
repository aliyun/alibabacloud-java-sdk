// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteDetectProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDetectProcessResponseBody body;

    public static DeleteDetectProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectProcessResponse self = new DeleteDetectProcessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDetectProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDetectProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDetectProcessResponse setBody(DeleteDetectProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDetectProcessResponseBody getBody() {
        return this.body;
    }

}
