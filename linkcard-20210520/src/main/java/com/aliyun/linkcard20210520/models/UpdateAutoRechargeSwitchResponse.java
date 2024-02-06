// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class UpdateAutoRechargeSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoRechargeSwitchResponseBody body;

    public static UpdateAutoRechargeSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoRechargeSwitchResponse self = new UpdateAutoRechargeSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoRechargeSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoRechargeSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoRechargeSwitchResponse setBody(UpdateAutoRechargeSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoRechargeSwitchResponseBody getBody() {
        return this.body;
    }

}
