// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteUdfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUdfResponseBody body;

    public static DeleteUdfResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdfResponse self = new DeleteUdfResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUdfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUdfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUdfResponse setBody(DeleteUdfResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUdfResponseBody getBody() {
        return this.body;
    }

}
