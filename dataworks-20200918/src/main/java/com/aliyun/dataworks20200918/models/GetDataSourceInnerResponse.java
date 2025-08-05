// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDataSourceInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceInnerResponseBody body;

    public static GetDataSourceInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceInnerResponse self = new GetDataSourceInnerResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceInnerResponse setBody(GetDataSourceInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceInnerResponseBody getBody() {
        return this.body;
    }

}
