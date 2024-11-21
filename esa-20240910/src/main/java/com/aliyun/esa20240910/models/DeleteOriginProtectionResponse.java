// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOriginProtectionResponseBody body;

    public static DeleteOriginProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginProtectionResponse self = new DeleteOriginProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOriginProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOriginProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOriginProtectionResponse setBody(DeleteOriginProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOriginProtectionResponseBody getBody() {
        return this.body;
    }

}
