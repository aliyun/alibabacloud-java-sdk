// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportDataSourcesResponseBody body;

    public static ImportDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDataSourcesResponse self = new ImportDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ImportDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportDataSourcesResponse setBody(ImportDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDataSourcesResponseBody getBody() {
        return this.body;
    }

}
