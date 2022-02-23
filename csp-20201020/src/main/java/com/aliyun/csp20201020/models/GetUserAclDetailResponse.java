// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class GetUserAclDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserAclDetailResponseBody body;

    public static GetUserAclDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAclDetailResponse self = new GetUserAclDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAclDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAclDetailResponse setBody(GetUserAclDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAclDetailResponseBody getBody() {
        return this.body;
    }

}
