// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDashboardDeviceInfoResponseBody body;

    public static DescribeDashboardDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardDeviceInfoResponse self = new DescribeDashboardDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardDeviceInfoResponse setBody(DescribeDashboardDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
