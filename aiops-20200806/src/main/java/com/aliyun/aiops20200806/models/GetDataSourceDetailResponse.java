// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataSourceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceDetailResponseBody body;

    public static GetDataSourceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDetailResponse self = new GetDataSourceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceDetailResponse setBody(GetDataSourceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceDetailResponseBody getBody() {
        return this.body;
    }

}
