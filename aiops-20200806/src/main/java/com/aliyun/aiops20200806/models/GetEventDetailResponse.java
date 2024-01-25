// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventDetailResponseBody body;

    public static GetEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventDetailResponse self = new GetEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventDetailResponse setBody(GetEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventDetailResponseBody getBody() {
        return this.body;
    }

}
