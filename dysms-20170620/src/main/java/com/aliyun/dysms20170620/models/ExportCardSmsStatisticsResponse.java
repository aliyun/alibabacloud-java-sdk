// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCardSmsStatisticsResponseBody body;

    public static ExportCardSmsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsStatisticsResponse self = new ExportCardSmsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCardSmsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCardSmsStatisticsResponse setBody(ExportCardSmsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCardSmsStatisticsResponseBody getBody() {
        return this.body;
    }

}
