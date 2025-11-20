// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteModelProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelProxyResult body;

    public static DeleteModelProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelProxyResponse self = new DeleteModelProxyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelProxyResponse setBody(DeleteModelProxyResult body) {
        this.body = body;
        return this;
    }
    public DeleteModelProxyResult getBody() {
        return this.body;
    }

}
