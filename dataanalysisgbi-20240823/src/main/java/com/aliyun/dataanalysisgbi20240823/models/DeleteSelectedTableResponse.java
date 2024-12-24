// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class DeleteSelectedTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSelectedTableResponseBody body;

    public static DeleteSelectedTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSelectedTableResponse self = new DeleteSelectedTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSelectedTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSelectedTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSelectedTableResponse setBody(DeleteSelectedTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSelectedTableResponseBody getBody() {
        return this.body;
    }

}
