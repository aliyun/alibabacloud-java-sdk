// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMmsDataSourceResponseBody body;

    public static GetMmsDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMmsDataSourceResponse self = new GetMmsDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetMmsDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMmsDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMmsDataSourceResponse setBody(GetMmsDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMmsDataSourceResponseBody getBody() {
        return this.body;
    }

}
