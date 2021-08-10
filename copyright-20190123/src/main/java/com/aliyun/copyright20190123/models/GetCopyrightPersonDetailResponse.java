// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCopyrightPersonDetailResponseBody body;

    public static GetCopyrightPersonDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonDetailResponse self = new GetCopyrightPersonDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopyrightPersonDetailResponse setBody(GetCopyrightPersonDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopyrightPersonDetailResponseBody getBody() {
        return this.body;
    }

}
