// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSiteMonitorsResponseBody body;

    public static DisableSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsResponse self = new DisableSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public DisableSiteMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSiteMonitorsResponse setBody(DisableSiteMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSiteMonitorsResponseBody getBody() {
        return this.body;
    }

}
