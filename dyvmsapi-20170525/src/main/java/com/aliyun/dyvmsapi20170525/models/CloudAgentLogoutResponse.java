// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentLogoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentLogoutResponseBody body;

    public static CloudAgentLogoutResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentLogoutResponse self = new CloudAgentLogoutResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentLogoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentLogoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentLogoutResponse setBody(CloudAgentLogoutResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentLogoutResponseBody getBody() {
        return this.body;
    }

}
