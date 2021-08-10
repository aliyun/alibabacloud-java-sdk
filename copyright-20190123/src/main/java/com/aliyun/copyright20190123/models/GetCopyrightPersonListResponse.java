// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetCopyrightPersonListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCopyrightPersonListResponseBody body;

    public static GetCopyrightPersonListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightPersonListResponse self = new GetCopyrightPersonListResponse();
        return TeaModel.build(map, self);
    }

    public GetCopyrightPersonListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopyrightPersonListResponse setBody(GetCopyrightPersonListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopyrightPersonListResponseBody getBody() {
        return this.body;
    }

}
