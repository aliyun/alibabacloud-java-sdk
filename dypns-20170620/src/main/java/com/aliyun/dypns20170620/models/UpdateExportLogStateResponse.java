// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class UpdateExportLogStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExportLogStateResponseBody body;

    public static UpdateExportLogStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExportLogStateResponse self = new UpdateExportLogStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExportLogStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExportLogStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExportLogStateResponse setBody(UpdateExportLogStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExportLogStateResponseBody getBody() {
        return this.body;
    }

}
