// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstantSiteMonitorResponseBody body;

    public static CreateInstantSiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantSiteMonitorResponse self = new CreateInstantSiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstantSiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstantSiteMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstantSiteMonitorResponse setBody(CreateInstantSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstantSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
