// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceInstanceResponseBody body;

    public static GetServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceResponse self = new GetServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceInstanceResponse setBody(GetServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
