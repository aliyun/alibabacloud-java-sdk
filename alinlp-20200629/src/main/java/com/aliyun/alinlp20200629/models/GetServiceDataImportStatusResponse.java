// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetServiceDataImportStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceDataImportStatusResponseBody body;

    public static GetServiceDataImportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDataImportStatusResponse self = new GetServiceDataImportStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceDataImportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceDataImportStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceDataImportStatusResponse setBody(GetServiceDataImportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceDataImportStatusResponseBody getBody() {
        return this.body;
    }

}
