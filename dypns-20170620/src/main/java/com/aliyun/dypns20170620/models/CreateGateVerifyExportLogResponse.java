// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateGateVerifyExportLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGateVerifyExportLogResponseBody body;

    public static CreateGateVerifyExportLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGateVerifyExportLogResponse self = new CreateGateVerifyExportLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateGateVerifyExportLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGateVerifyExportLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGateVerifyExportLogResponse setBody(CreateGateVerifyExportLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGateVerifyExportLogResponseBody getBody() {
        return this.body;
    }

}
