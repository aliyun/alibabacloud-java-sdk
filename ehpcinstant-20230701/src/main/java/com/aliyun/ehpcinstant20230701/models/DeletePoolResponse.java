// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeletePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePoolResponseBody body;

    public static DeletePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePoolResponse self = new DeletePoolResponse();
        return TeaModel.build(map, self);
    }

    public DeletePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePoolResponse setBody(DeletePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePoolResponseBody getBody() {
        return this.body;
    }

}
