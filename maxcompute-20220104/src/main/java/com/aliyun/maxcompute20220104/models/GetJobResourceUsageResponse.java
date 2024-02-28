// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetJobResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobResourceUsageResponseBody body;

    public static GetJobResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobResourceUsageResponse self = new GetJobResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetJobResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobResourceUsageResponse setBody(GetJobResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobResourceUsageResponseBody getBody() {
        return this.body;
    }

}
