// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentLoginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentLoginResponseBody body;

    public static CloudAgentLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentLoginResponse self = new CloudAgentLoginResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentLoginResponse setBody(CloudAgentLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentLoginResponseBody getBody() {
        return this.body;
    }

}
