// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceResponseBody body;

    public static GetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponse self = new GetServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceResponse setBody(GetServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceResponseBody getBody() {
        return this.body;
    }

}
