// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowEditLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowEditLockResponseBody body;

    public static CreateFlowEditLockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowEditLockResponse self = new CreateFlowEditLockResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowEditLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowEditLockResponse setBody(CreateFlowEditLockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowEditLockResponseBody getBody() {
        return this.body;
    }

}
