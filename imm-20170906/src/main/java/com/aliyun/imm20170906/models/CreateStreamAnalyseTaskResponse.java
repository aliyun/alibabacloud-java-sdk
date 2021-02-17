// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateStreamAnalyseTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStreamAnalyseTaskResponseBody body;

    public static CreateStreamAnalyseTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamAnalyseTaskResponse self = new CreateStreamAnalyseTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamAnalyseTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamAnalyseTaskResponse setBody(CreateStreamAnalyseTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamAnalyseTaskResponseBody getBody() {
        return this.body;
    }

}
