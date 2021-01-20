// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSiteMonitorQuotaResponse setBody(DescribeSiteMonitorQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorQuotaResponseBody getBody() {
        return this.body;
    }

}
