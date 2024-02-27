// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetInviteStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInviteStatusResponseBody body;

    public static GetInviteStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInviteStatusResponse self = new GetInviteStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetInviteStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInviteStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInviteStatusResponse setBody(GetInviteStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInviteStatusResponseBody getBody() {
        return this.body;
    }

}
