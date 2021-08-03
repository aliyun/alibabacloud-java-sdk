// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSpMetadataResponseBody body;

    public static GetSpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataResponse self = new GetSpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSpMetadataResponse setBody(GetSpMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSpMetadataResponseBody getBody() {
        return this.body;
    }

}
