// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteForwardEntryResponseBody body;

    public static DeleteForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryResponse self = new DeleteForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteForwardEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteForwardEntryResponse setBody(DeleteForwardEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteForwardEntryResponseBody getBody() {
        return this.body;
    }

}
