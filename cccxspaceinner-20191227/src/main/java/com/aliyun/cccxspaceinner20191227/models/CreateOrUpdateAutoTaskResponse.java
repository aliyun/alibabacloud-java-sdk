// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAutoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateAutoTaskResponseBody body;

    public static CreateOrUpdateAutoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAutoTaskResponse self = new CreateOrUpdateAutoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAutoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateAutoTaskResponse setBody(CreateOrUpdateAutoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateAutoTaskResponseBody getBody() {
        return this.body;
    }

}
