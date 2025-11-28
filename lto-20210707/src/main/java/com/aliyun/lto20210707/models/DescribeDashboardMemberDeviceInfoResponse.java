// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardMemberDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDashboardMemberDeviceInfoResponseBody body;

    public static DescribeDashboardMemberDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardMemberDeviceInfoResponse self = new DescribeDashboardMemberDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardMemberDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardMemberDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardMemberDeviceInfoResponse setBody(DescribeDashboardMemberDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardMemberDeviceInfoResponseBody getBody() {
        return this.body;
    }

}
