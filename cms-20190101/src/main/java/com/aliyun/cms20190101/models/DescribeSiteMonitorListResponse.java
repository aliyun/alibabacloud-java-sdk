// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorListResponseBody body;

    public static DescribeSiteMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListResponse self = new DescribeSiteMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorListResponse setBody(DescribeSiteMonitorListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorListResponseBody getBody() {
        return this.body;
    }

}
