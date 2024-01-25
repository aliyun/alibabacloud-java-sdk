// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetInstancesNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstancesNumResponseBody body;

    public static GetInstancesNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesNumResponse self = new GetInstancesNumResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancesNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstancesNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstancesNumResponse setBody(GetInstancesNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstancesNumResponseBody getBody() {
        return this.body;
    }

}
