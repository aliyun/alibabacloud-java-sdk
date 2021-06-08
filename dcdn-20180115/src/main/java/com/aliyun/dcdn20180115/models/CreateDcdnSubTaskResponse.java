// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDcdnSubTaskResponseBody body;

    public static CreateDcdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSubTaskResponse self = new CreateDcdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDcdnSubTaskResponse setBody(CreateDcdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDcdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
