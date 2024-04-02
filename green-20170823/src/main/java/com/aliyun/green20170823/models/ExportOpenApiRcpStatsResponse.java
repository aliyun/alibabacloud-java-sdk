// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOpenApiRcpStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportOpenApiRcpStatsResponseBody body;

    public static ExportOpenApiRcpStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportOpenApiRcpStatsResponse self = new ExportOpenApiRcpStatsResponse();
        return TeaModel.build(map, self);
    }

    public ExportOpenApiRcpStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportOpenApiRcpStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportOpenApiRcpStatsResponse setBody(ExportOpenApiRcpStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportOpenApiRcpStatsResponseBody getBody() {
        return this.body;
    }

}
