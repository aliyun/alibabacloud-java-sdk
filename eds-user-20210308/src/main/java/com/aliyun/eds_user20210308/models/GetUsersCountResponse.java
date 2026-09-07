// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetUsersCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUsersCountResponseBody body;

    public static GetUsersCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUsersCountResponse self = new GetUsersCountResponse();
        return TeaModel.build(map, self);
    }

    public GetUsersCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUsersCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUsersCountResponse setBody(GetUsersCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUsersCountResponseBody getBody() {
        return this.body;
    }

}
