// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageAppMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsacStageAppMappingResponseBody body;

    public static CreateMsacStageAppMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageAppMappingResponse self = new CreateMsacStageAppMappingResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageAppMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsacStageAppMappingResponse setBody(CreateMsacStageAppMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsacStageAppMappingResponseBody getBody() {
        return this.body;
    }

}
