// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAllAlgorithmConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAllAlgorithmConfigResponseBody body;

    public static GetAllAlgorithmConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllAlgorithmConfigResponse self = new GetAllAlgorithmConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAllAlgorithmConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllAlgorithmConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllAlgorithmConfigResponse setBody(GetAllAlgorithmConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllAlgorithmConfigResponseBody getBody() {
        return this.body;
    }

}
