// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceStatusResponseBody body;

    public static GetServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponse self = new GetServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceStatusResponse setBody(GetServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceStatusResponseBody getBody() {
        return this.body;
    }

}
