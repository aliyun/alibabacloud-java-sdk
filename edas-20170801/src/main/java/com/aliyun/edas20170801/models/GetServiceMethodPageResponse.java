// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceMethodPageResponseBody body;

    public static GetServiceMethodPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageResponse self = new GetServiceMethodPageResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceMethodPageResponse setBody(GetServiceMethodPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceMethodPageResponseBody getBody() {
        return this.body;
    }

}
