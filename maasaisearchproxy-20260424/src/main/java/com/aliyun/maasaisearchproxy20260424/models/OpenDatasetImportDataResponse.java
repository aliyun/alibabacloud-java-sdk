// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasaisearchproxy20260424.models;

import com.aliyun.tea.*;

public class OpenDatasetImportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenDatasetImportDataResponseBody body;

    public static OpenDatasetImportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDatasetImportDataResponse self = new OpenDatasetImportDataResponse();
        return TeaModel.build(map, self);
    }

    public OpenDatasetImportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDatasetImportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDatasetImportDataResponse setBody(OpenDatasetImportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDatasetImportDataResponseBody getBody() {
        return this.body;
    }

}
