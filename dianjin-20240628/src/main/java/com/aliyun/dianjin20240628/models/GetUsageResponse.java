// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUsageResponseBody body;

    public static GetUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUsageResponse self = new GetUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUsageResponse setBody(GetUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUsageResponseBody getBody() {
        return this.body;
    }

}
