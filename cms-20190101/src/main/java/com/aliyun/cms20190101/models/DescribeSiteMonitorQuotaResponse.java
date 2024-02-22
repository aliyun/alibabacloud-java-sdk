// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorQuotaResponseBody body;

    public static DescribeSiteMonitorQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorQuotaResponse self = new DescribeSiteMonitorQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorQuotaResponse setBody(DescribeSiteMonitorQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorQuotaResponseBody getBody() {
        return this.body;
    }

}
