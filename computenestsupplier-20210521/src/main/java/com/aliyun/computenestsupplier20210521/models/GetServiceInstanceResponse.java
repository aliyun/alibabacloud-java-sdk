// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceInstanceResponse setBody(GetServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
