// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSiteMonitorLogResponse setBody(DescribeSiteMonitorLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorLogResponseBody getBody() {
        return this.body;
    }

}
