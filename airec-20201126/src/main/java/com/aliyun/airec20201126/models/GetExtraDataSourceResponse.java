// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetExtraDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExtraDataSourceResponseBody body;

    public static GetExtraDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExtraDataSourceResponse self = new GetExtraDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetExtraDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExtraDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExtraDataSourceResponse setBody(GetExtraDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExtraDataSourceResponseBody getBody() {
        return this.body;
    }

}
