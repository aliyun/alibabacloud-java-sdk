// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetAdUsersCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdUsersCountResponseBody body;

    public static GetAdUsersCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdUsersCountResponse self = new GetAdUsersCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAdUsersCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdUsersCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdUsersCountResponse setBody(GetAdUsersCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdUsersCountResponseBody getBody() {
        return this.body;
    }

}
