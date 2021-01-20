// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSiteMonitorsResponseBody body;

    public static EnableSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsResponse self = new EnableSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public EnableSiteMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSiteMonitorsResponse setBody(EnableSiteMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSiteMonitorsResponseBody getBody() {
        return this.body;
    }

}
