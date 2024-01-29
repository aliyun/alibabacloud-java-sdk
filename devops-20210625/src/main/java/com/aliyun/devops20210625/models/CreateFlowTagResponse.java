// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFlowTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowTagResponseBody body;

    public static CreateFlowTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowTagResponse self = new CreateFlowTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowTagResponse setBody(CreateFlowTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowTagResponseBody getBody() {
        return this.body;
    }

}
