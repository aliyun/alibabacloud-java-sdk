// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetModelProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelProxyResult body;

    public static GetModelProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelProxyResponse self = new GetModelProxyResponse();
        return TeaModel.build(map, self);
    }

    public GetModelProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelProxyResponse setBody(ModelProxyResult body) {
        this.body = body;
        return this;
    }
    public ModelProxyResult getBody() {
        return this.body;
    }

}
