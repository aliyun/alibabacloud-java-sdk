// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCdsFileShareLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelCdsFileShareLinkResponseBody body;

    public static CancelCdsFileShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCdsFileShareLinkResponse self = new CancelCdsFileShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public CancelCdsFileShareLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCdsFileShareLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCdsFileShareLinkResponse setBody(CancelCdsFileShareLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCdsFileShareLinkResponseBody getBody() {
        return this.body;
    }

}
