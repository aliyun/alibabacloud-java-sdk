// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBucketsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBucketsListResponseBody body;

    public static GetBucketsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBucketsListResponse self = new GetBucketsListResponse();
        return TeaModel.build(map, self);
    }

    public GetBucketsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBucketsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBucketsListResponse setBody(GetBucketsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBucketsListResponseBody getBody() {
        return this.body;
    }

}
