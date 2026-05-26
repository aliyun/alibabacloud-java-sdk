// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class ImportDatasetDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDatasetDataResponseBody body;

    public static ImportDatasetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDatasetDataResponse self = new ImportDatasetDataResponse();
        return TeaModel.build(map, self);
    }

    public ImportDatasetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDatasetDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDatasetDataResponse setBody(ImportDatasetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDatasetDataResponseBody getBody() {
        return this.body;
    }

}
