// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainsUsageByDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainsUsageByDayResponse setBody(DescribeDomainsUsageByDayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsUsageByDayResponseBody getBody() {
        return this.body;
    }

}
