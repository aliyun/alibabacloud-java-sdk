// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteMonitorAttributeResponseBody body;

    public static DescribeSiteMonitorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeResponse self = new DescribeSiteMonitorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteMonitorAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteMonitorAttributeResponse setBody(DescribeSiteMonitorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBody getBody() {
        return this.body;
    }

}
