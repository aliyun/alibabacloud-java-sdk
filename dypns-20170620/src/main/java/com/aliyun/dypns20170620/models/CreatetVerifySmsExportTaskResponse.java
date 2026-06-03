// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreatetVerifySmsExportTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatetVerifySmsExportTaskResponseBody body;

    public static CreatetVerifySmsExportTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatetVerifySmsExportTaskResponse self = new CreatetVerifySmsExportTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatetVerifySmsExportTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatetVerifySmsExportTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatetVerifySmsExportTaskResponse setBody(CreatetVerifySmsExportTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatetVerifySmsExportTaskResponseBody getBody() {
        return this.body;
    }

}
