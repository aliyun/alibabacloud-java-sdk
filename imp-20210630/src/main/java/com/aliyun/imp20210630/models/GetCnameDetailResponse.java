// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetCnameDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCnameDetailResponseBody body;

    public static GetCnameDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCnameDetailResponse self = new GetCnameDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCnameDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCnameDetailResponse setBody(GetCnameDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCnameDetailResponseBody getBody() {
        return this.body;
    }

}
