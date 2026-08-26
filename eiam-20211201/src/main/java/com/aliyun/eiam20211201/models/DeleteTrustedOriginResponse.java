// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrustedOriginResponseBody body;

    public static DeleteTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrustedOriginResponse self = new DeleteTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrustedOriginResponse setBody(DeleteTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
