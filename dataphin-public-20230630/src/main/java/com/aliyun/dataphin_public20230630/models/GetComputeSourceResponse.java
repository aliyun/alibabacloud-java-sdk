// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetComputeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeSourceResponseBody body;

    public static GetComputeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeSourceResponse self = new GetComputeSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeSourceResponse setBody(GetComputeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeSourceResponseBody getBody() {
        return this.body;
    }

}
