// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRulengDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRulengDistributeJobResponseBody body;

    public static CreateRulengDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRulengDistributeJobResponse self = new CreateRulengDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateRulengDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRulengDistributeJobResponse setBody(CreateRulengDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRulengDistributeJobResponseBody getBody() {
        return this.body;
    }

}
