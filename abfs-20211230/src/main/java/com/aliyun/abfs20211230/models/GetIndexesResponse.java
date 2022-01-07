// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class GetIndexesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIndexesResponseBody body;

    public static GetIndexesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexesResponse self = new GetIndexesResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexesResponse setBody(GetIndexesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexesResponseBody getBody() {
        return this.body;
    }

}
