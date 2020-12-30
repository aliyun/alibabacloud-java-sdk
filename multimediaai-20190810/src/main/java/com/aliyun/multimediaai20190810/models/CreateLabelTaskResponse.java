// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateLabelTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLabelTaskResponseBody body;

    public static CreateLabelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskResponse self = new CreateLabelTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLabelTaskResponse setBody(CreateLabelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLabelTaskResponseBody getBody() {
        return this.body;
    }

}
