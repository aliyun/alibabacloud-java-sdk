// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelServiceResult body;

    public static GetModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelServiceResponse self = new GetModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelServiceResponse setBody(ModelServiceResult body) {
        this.body = body;
        return this;
    }
    public ModelServiceResult getBody() {
        return this.body;
    }

}
