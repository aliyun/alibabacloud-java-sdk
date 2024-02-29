// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportDataSourcesResponseBody body;

    public static ExportDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesResponse self = new ExportDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ExportDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportDataSourcesResponse setBody(ExportDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDataSourcesResponseBody getBody() {
        return this.body;
    }

}
