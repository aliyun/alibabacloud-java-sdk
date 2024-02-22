// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorLogResponseBody body;

    public static DescribeSiteMonitorLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorLogResponse self = new DescribeSiteMonitorLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorLogResponse setBody(DescribeSiteMonitorLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorLogResponseBody getBody() {
        return this.body;
    }

}
