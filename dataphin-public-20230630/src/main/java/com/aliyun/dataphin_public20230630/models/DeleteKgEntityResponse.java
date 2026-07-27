// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKgEntityResponseBody body;

    public static DeleteKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKgEntityResponse self = new DeleteKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKgEntityResponse setBody(DeleteKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKgEntityResponseBody getBody() {
        return this.body;
    }

}
