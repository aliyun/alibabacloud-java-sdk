// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class RemoveGateVerifyExportLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveGateVerifyExportLogResponseBody body;

    public static RemoveGateVerifyExportLogResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGateVerifyExportLogResponse self = new RemoveGateVerifyExportLogResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGateVerifyExportLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGateVerifyExportLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveGateVerifyExportLogResponse setBody(RemoveGateVerifyExportLogResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGateVerifyExportLogResponseBody getBody() {
        return this.body;
    }

}
