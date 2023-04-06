// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeApplicationFromGroupsResponseBody body;

    public static RevokeApplicationFromGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromGroupsResponse self = new RevokeApplicationFromGroupsResponse();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeApplicationFromGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeApplicationFromGroupsResponse setBody(RevokeApplicationFromGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeApplicationFromGroupsResponseBody getBody() {
        return this.body;
    }

}
