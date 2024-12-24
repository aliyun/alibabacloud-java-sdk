// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionWithScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProcessDefinitionWithScheduleResponseBody body;

    public static UpdateProcessDefinitionWithScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionWithScheduleResponse self = new UpdateProcessDefinitionWithScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionWithScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProcessDefinitionWithScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProcessDefinitionWithScheduleResponse setBody(UpdateProcessDefinitionWithScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProcessDefinitionWithScheduleResponseBody getBody() {
        return this.body;
    }

}
