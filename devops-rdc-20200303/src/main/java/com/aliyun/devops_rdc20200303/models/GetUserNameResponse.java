// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetUserNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserNameResponseBody body;

    public static GetUserNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserNameResponse self = new GetUserNameResponse();
        return TeaModel.build(map, self);
    }

    public GetUserNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserNameResponse setBody(GetUserNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserNameResponseBody getBody() {
        return this.body;
    }

}
