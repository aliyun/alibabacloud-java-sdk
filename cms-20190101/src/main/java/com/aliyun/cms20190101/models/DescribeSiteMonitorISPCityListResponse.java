// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorISPCityListResponseBody body;

    public static DescribeSiteMonitorISPCityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorISPCityListResponse self = new DescribeSiteMonitorISPCityListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorISPCityListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorISPCityListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorISPCityListResponse setBody(DescribeSiteMonitorISPCityListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorISPCityListResponseBody getBody() {
        return this.body;
    }

}
