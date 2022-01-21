// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateInstantSiteMonitorResponse setBody(CreateInstantSiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstantSiteMonitorResponseBody getBody() {
        return this.body;
    }

}
