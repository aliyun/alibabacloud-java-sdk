// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBusinessGroupListResponseBody body;

    public static GetBusinessGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupListResponse self = new GetBusinessGroupListResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupListResponse setBody(GetBusinessGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupListResponseBody getBody() {
        return this.body;
    }

}
