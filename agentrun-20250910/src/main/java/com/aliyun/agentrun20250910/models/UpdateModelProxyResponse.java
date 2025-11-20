// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelProxyResult body;

    public static UpdateModelProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProxyResponse self = new UpdateModelProxyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelProxyResponse setBody(ModelProxyResult body) {
        this.body = body;
        return this;
    }
    public ModelProxyResult getBody() {
        return this.body;
    }

}
