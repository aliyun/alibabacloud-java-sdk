// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppListResponseBody body;

    public static GetAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppListResponse self = new GetAppListResponse();
        return TeaModel.build(map, self);
    }

    public GetAppListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppListResponse setBody(GetAppListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppListResponseBody getBody() {
        return this.body;
    }

}
