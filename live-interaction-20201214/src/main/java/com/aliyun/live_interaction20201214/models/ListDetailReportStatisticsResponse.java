// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListDetailReportStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDetailReportStatisticsResponseBody body;

    public static ListDetailReportStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetailReportStatisticsResponse self = new ListDetailReportStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetailReportStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetailReportStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDetailReportStatisticsResponse setBody(ListDetailReportStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetailReportStatisticsResponseBody getBody() {
        return this.body;
    }

}
