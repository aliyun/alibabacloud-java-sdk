// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowProjectResponseBody body;

    public static CreateFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectResponse self = new CreateFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowProjectResponse setBody(CreateFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowProjectResponseBody getBody() {
        return this.body;
    }

}
