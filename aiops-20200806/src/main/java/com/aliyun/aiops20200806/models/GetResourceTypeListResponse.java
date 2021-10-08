// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetResourceTypeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceTypeListResponseBody body;

    public static GetResourceTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeListResponse self = new GetResourceTypeListResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTypeListResponse setBody(GetResourceTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTypeListResponseBody getBody() {
        return this.body;
    }

}
