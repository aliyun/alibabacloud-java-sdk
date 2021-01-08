// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserInfoResponseBody body;

    public static GetUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponse self = new GetUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserInfoResponse setBody(GetUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserInfoResponseBody getBody() {
        return this.body;
    }

}
