// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParametersForImportResponseBody body;

    public static GetParametersForImportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportResponse self = new GetParametersForImportResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersForImportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersForImportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParametersForImportResponse setBody(GetParametersForImportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersForImportResponseBody getBody() {
        return this.body;
    }

}
