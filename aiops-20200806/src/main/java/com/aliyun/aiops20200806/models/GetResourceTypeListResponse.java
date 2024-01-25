// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetResourceTypeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceTypeListResponseBody body;

    public static GetResourceTypeListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeListResponse self = new GetResourceTypeListResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTypeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTypeListResponse setBody(GetResourceTypeListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTypeListResponseBody getBody() {
        return this.body;
    }

}
