// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetLoginPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLoginPageResponseBody body;

    public static GetLoginPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPageResponse self = new GetLoginPageResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginPageResponse setBody(GetLoginPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginPageResponseBody getBody() {
        return this.body;
    }

}
