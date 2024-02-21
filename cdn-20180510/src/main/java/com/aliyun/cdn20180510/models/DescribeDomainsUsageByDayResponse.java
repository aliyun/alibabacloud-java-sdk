// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsUsageByDayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainsUsageByDayResponseBody body;

    public static DescribeDomainsUsageByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsUsageByDayResponse self = new DescribeDomainsUsageByDayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsUsageByDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainsUsageByDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainsUsageByDayResponse setBody(DescribeDomainsUsageByDayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBody getBody() {
        return this.body;
    }

}
