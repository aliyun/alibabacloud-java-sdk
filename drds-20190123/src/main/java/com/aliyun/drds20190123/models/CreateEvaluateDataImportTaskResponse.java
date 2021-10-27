// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateEvaluateDataImportTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEvaluateDataImportTaskResponseBody body;

    public static CreateEvaluateDataImportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluateDataImportTaskResponse self = new CreateEvaluateDataImportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluateDataImportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluateDataImportTaskResponse setBody(CreateEvaluateDataImportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluateDataImportTaskResponseBody getBody() {
        return this.body;
    }

}
