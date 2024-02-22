// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorStatisticsResponseBody body;

    public static DescribeSiteMonitorStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorStatisticsResponse self = new DescribeSiteMonitorStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorStatisticsResponse setBody(DescribeSiteMonitorStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorStatisticsResponseBody getBody() {
        return this.body;
    }

}
