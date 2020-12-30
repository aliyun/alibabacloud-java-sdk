// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagLayersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRepoTagLayersResponseBody body;

    public static GetRepoTagLayersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagLayersResponse self = new GetRepoTagLayersResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoTagLayersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoTagLayersResponse setBody(GetRepoTagLayersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepoTagLayersResponseBody getBody() {
        return this.body;
    }

}
