// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceListResponseBody body;

    public static GetServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListResponse self = new GetServiceListResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceListResponse setBody(GetServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceListResponseBody getBody() {
        return this.body;
    }

}
