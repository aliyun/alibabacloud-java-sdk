// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetUsersResponse setBody(GetUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUsersResponseBody getBody() {
        return this.body;
    }

}
