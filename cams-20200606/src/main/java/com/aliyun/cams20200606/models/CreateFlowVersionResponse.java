// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowVersionResponseBody body;

    public static CreateFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowVersionResponse self = new CreateFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowVersionResponse setBody(CreateFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowVersionResponseBody getBody() {
        return this.body;
    }

}
