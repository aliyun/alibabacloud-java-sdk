// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetClassDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClassDetailResponseBody body;

    public static GetClassDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClassDetailResponse self = new GetClassDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClassDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClassDetailResponse setBody(GetClassDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClassDetailResponseBody getBody() {
        return this.body;
    }

}
