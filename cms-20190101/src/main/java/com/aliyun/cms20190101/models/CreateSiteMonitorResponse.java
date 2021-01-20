// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSiteMonitorResponse setBody(CreateSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
