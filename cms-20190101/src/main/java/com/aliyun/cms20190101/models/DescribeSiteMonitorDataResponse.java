// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSiteMonitorDataResponse setBody(DescribeSiteMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteMonitorDataResponseBody getBody() {
        return this.body;
    }

}
