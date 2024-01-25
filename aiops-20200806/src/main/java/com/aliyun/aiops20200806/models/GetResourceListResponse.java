// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetResourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceListResponseBody body;

    public static GetResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceListResponse self = new GetResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceListResponse setBody(GetResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceListResponseBody getBody() {
        return this.body;
    }

}
