// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateVideoLabelClassificationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoLabelClassificationTaskResponseBody body;

    public static CreateVideoLabelClassificationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoLabelClassificationTaskResponse self = new CreateVideoLabelClassificationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoLabelClassificationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoLabelClassificationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoLabelClassificationTaskResponse setBody(CreateVideoLabelClassificationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoLabelClassificationTaskResponseBody getBody() {
        return this.body;
    }

}
