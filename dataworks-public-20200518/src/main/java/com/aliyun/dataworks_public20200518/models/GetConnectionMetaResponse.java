// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetConnectionMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectionMetaResponseBody body;

    public static GetConnectionMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionMetaResponse self = new GetConnectionMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectionMetaResponse setBody(GetConnectionMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectionMetaResponseBody getBody() {
        return this.body;
    }

}
