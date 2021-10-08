// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetConnectInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConnectInstancesResponseBody body;

    public static GetConnectInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectInstancesResponse self = new GetConnectInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConnectInstancesResponse setBody(GetConnectInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConnectInstancesResponseBody getBody() {
        return this.body;
    }

}
