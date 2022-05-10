// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RejectLinkMicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RejectLinkMicResponseBody body;

    public static RejectLinkMicResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectLinkMicResponse self = new RejectLinkMicResponse();
        return TeaModel.build(map, self);
    }

    public RejectLinkMicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectLinkMicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectLinkMicResponse setBody(RejectLinkMicResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectLinkMicResponseBody getBody() {
        return this.body;
    }

}
