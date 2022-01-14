// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsacStageResponseBody body;

    public static CreateMsacStageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageResponse self = new CreateMsacStageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsacStageResponse setBody(CreateMsacStageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsacStageResponseBody getBody() {
        return this.body;
    }

}
