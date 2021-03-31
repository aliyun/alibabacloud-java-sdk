// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMetaCategoryResponseBody body;

    public static GetMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryResponse self = new GetMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaCategoryResponse setBody(GetMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
