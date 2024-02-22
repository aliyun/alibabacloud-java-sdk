// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DisableSiteMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSiteMonitorsResponse setBody(DisableSiteMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSiteMonitorsResponseBody getBody() {
        return this.body;
    }

}
