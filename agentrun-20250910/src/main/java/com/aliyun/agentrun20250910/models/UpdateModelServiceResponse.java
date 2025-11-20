// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelServiceResult body;

    public static UpdateModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceResponse self = new UpdateModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelServiceResponse setBody(ModelServiceResult body) {
        this.body = body;
        return this;
    }
    public ModelServiceResult getBody() {
        return this.body;
    }

}
