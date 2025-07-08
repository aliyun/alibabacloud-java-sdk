// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTmpEffectReportDataResponseBody body;

    public static QueryTmpEffectReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDataResponse self = new QueryTmpEffectReportDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTmpEffectReportDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTmpEffectReportDataResponse setBody(QueryTmpEffectReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTmpEffectReportDataResponseBody getBody() {
        return this.body;
    }

}
