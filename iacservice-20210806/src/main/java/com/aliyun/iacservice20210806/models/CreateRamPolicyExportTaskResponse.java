// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRamPolicyExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRamPolicyExportTaskResponseBody body;

    public static CreateRamPolicyExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRamPolicyExportTaskResponse self = new CreateRamPolicyExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRamPolicyExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRamPolicyExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRamPolicyExportTaskResponse setBody(CreateRamPolicyExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRamPolicyExportTaskResponseBody getBody() {
        return this.body;
    }

}
