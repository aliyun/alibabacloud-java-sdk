// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAnalyseTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVideoAnalyseTaskResponseBody body;

    public static CreateVideoAnalyseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAnalyseTaskResponse self = new CreateVideoAnalyseTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoAnalyseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoAnalyseTaskResponse setBody(CreateVideoAnalyseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoAnalyseTaskResponseBody getBody() {
        return this.body;
    }

}
