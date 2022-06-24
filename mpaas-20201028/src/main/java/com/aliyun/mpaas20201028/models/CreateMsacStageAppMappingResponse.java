// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageAppMappingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public CreateMsacStageAppMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMsacStageAppMappingResponse setBody(CreateMsacStageAppMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsacStageAppMappingResponseBody getBody() {
        return this.body;
    }

}
