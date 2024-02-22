// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorDataResponseBody body;

    public static DescribeSiteMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorDataResponse self = new DescribeSiteMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorDataResponse setBody(DescribeSiteMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorDataResponseBody getBody() {
        return this.body;
    }

}
