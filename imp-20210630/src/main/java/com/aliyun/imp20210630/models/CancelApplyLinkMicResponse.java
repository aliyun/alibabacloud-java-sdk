// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelApplyLinkMicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelApplyLinkMicResponseBody body;

    public static CancelApplyLinkMicResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelApplyLinkMicResponse self = new CancelApplyLinkMicResponse();
        return TeaModel.build(map, self);
    }

    public CancelApplyLinkMicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelApplyLinkMicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelApplyLinkMicResponse setBody(CancelApplyLinkMicResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelApplyLinkMicResponseBody getBody() {
        return this.body;
    }

}
