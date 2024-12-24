// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionWithScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProcessDefinitionWithScheduleResponseBody body;

    public static CreateProcessDefinitionWithScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionWithScheduleResponse self = new CreateProcessDefinitionWithScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionWithScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProcessDefinitionWithScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProcessDefinitionWithScheduleResponse setBody(CreateProcessDefinitionWithScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProcessDefinitionWithScheduleResponseBody getBody() {
        return this.body;
    }

}
