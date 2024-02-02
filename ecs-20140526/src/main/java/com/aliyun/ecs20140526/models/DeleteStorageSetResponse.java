// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteStorageSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStorageSetResponseBody body;

    public static DeleteStorageSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageSetResponse self = new DeleteStorageSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStorageSetResponse setBody(DeleteStorageSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageSetResponseBody getBody() {
        return this.body;
    }

}
