// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeApplicationFromUsersResponseBody body;

    public static RevokeApplicationFromUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromUsersResponse self = new RevokeApplicationFromUsersResponse();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeApplicationFromUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeApplicationFromUsersResponse setBody(RevokeApplicationFromUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeApplicationFromUsersResponseBody getBody() {
        return this.body;
    }

}
