// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTagDropListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTagDropListResponseBody body;

    public static GetTagDropListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagDropListResponse self = new GetTagDropListResponse();
        return TeaModel.build(map, self);
    }

    public GetTagDropListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagDropListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagDropListResponse setBody(GetTagDropListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagDropListResponseBody getBody() {
        return this.body;
    }

}
