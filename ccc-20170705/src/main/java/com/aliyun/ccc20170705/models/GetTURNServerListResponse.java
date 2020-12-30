// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNServerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTURNServerListResponseBody body;

    public static GetTURNServerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTURNServerListResponse self = new GetTURNServerListResponse();
        return TeaModel.build(map, self);
    }

    public GetTURNServerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTURNServerListResponse setBody(GetTURNServerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTURNServerListResponseBody getBody() {
        return this.body;
    }

}
