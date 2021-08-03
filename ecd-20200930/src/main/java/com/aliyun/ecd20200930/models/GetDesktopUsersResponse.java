// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDesktopUsersResponseBody body;

    public static GetDesktopUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopUsersResponse self = new GetDesktopUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetDesktopUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDesktopUsersResponse setBody(GetDesktopUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDesktopUsersResponseBody getBody() {
        return this.body;
    }

}
