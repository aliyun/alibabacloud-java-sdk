// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasetResponseBody body;

    public static GetDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponse self = new GetDatasetResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasetResponse setBody(GetDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasetResponseBody getBody() {
        return this.body;
    }

}
