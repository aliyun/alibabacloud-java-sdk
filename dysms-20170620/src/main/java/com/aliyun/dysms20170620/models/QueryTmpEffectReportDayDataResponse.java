// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDayDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTmpEffectReportDayDataResponseBody body;

    public static QueryTmpEffectReportDayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDayDataResponse self = new QueryTmpEffectReportDayDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDayDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTmpEffectReportDayDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTmpEffectReportDayDataResponse setBody(QueryTmpEffectReportDayDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTmpEffectReportDayDataResponseBody getBody() {
        return this.body;
    }

}
