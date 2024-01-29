// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorAvailableConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDnsGtmMonitorAvailableConfigResponseBody body;

    public static DescribeDnsGtmMonitorAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorAvailableConfigResponse self = new DescribeDnsGtmMonitorAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse setBody(DescribeDnsGtmMonitorAvailableConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDnsGtmMonitorAvailableConfigResponseBody getBody() {
        return this.body;
    }

}
