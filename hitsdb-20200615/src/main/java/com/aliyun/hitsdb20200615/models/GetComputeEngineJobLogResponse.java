// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetComputeEngineJobLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeEngineJobLogResponseBody body;

    public static GetComputeEngineJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeEngineJobLogResponse self = new GetComputeEngineJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeEngineJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeEngineJobLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeEngineJobLogResponse setBody(GetComputeEngineJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeEngineJobLogResponseBody getBody() {
        return this.body;
    }

}
