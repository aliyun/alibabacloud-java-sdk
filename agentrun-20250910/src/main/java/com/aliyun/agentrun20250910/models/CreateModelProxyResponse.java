// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelProxyResult body;

    public static CreateModelProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProxyResponse self = new CreateModelProxyResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelProxyResponse setBody(ModelProxyResult body) {
        this.body = body;
        return this;
    }
    public ModelProxyResult getBody() {
        return this.body;
    }

}
