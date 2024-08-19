// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportCipStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCipStatsResponseBody body;

    public static ExportCipStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCipStatsResponse self = new ExportCipStatsResponse();
        return TeaModel.build(map, self);
    }

    public ExportCipStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCipStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCipStatsResponse setBody(ExportCipStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCipStatsResponseBody getBody() {
        return this.body;
    }

}
