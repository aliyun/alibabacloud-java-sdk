// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaisEiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEaisEiResponseBody body;

    public static DeleteEaisEiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaisEiResponse self = new DeleteEaisEiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEaisEiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEaisEiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEaisEiResponse setBody(DeleteEaisEiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEaisEiResponseBody getBody() {
        return this.body;
    }

}
