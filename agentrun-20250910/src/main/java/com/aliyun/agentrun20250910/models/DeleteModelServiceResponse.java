// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelServiceResult body;

    public static DeleteModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceResponse self = new DeleteModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelServiceResponse setBody(DeleteModelServiceResult body) {
        this.body = body;
        return this;
    }
    public DeleteModelServiceResult getBody() {
        return this.body;
    }

}
