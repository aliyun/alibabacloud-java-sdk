// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PublishFunctionVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Version body;

    public static PublishFunctionVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishFunctionVersionResponse self = new PublishFunctionVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishFunctionVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishFunctionVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishFunctionVersionResponse setBody(Version body) {
        this.body = body;
        return this;
    }
    public Version getBody() {
        return this.body;
    }

}
