// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteInstantMonitorLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSiteInstantMonitorLogResponseBody body;

    public static DescribeSiteInstantMonitorLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteInstantMonitorLogResponse self = new DescribeSiteInstantMonitorLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteInstantMonitorLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteInstantMonitorLogResponse setBody(DescribeSiteInstantMonitorLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteInstantMonitorLogResponseBody getBody() {
        return this.body;
    }

}
