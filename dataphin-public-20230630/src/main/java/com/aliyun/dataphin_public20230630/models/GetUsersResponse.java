// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUsersResponseBody body;

    public static GetUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUsersResponse self = new GetUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUsersResponse setBody(GetUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUsersResponseBody getBody() {
        return this.body;
    }

}
