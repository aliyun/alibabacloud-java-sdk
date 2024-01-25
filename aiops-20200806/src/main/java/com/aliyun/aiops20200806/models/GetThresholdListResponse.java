// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetThresholdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThresholdListResponseBody body;

    public static GetThresholdListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThresholdListResponse self = new GetThresholdListResponse();
        return TeaModel.build(map, self);
    }

    public GetThresholdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThresholdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThresholdListResponse setBody(GetThresholdListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThresholdListResponseBody getBody() {
        return this.body;
    }

}
