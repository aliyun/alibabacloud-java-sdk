// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticDataSourceResponseBody body;

    public static GetAgenticDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticDataSourceResponse self = new GetAgenticDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticDataSourceResponse setBody(GetAgenticDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticDataSourceResponseBody getBody() {
        return this.body;
    }

}
