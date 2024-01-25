// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessGroupIndexResponseBody body;

    public static GetBusinessGroupIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupIndexResponse self = new GetBusinessGroupIndexResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessGroupIndexResponse setBody(GetBusinessGroupIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupIndexResponseBody getBody() {
        return this.body;
    }

}
