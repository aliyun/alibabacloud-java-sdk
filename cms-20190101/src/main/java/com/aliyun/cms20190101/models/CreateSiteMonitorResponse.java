// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSiteMonitorResponseBody body;

    public static CreateSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorResponse self = new CreateSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateSiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSiteMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSiteMonitorResponse setBody(CreateSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
