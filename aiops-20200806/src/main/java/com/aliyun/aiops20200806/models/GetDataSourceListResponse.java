// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataSourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataSourceListResponseBody body;

    public static GetDataSourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceListResponse self = new GetDataSourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceListResponse setBody(GetDataSourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceListResponseBody getBody() {
        return this.body;
    }

}
