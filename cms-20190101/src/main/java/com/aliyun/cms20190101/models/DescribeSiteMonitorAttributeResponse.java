// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSiteMonitorAttributeResponse setBody(DescribeSiteMonitorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorAttributeResponseBody getBody() {
        return this.body;
    }

}
