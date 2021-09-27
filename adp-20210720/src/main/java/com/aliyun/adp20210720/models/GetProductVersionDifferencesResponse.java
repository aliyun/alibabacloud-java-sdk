// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionDifferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionDifferencesResponseBody body;

    public static GetProductVersionDifferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionDifferencesResponse self = new GetProductVersionDifferencesResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionDifferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionDifferencesResponse setBody(GetProductVersionDifferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionDifferencesResponseBody getBody() {
        return this.body;
    }

}
