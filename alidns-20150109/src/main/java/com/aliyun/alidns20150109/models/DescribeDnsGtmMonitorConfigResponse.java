// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmMonitorConfigResponseBody body;

    public static DescribeDnsGtmMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorConfigResponse self = new DescribeDnsGtmMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmMonitorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmMonitorConfigResponse setBody(DescribeDnsGtmMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
