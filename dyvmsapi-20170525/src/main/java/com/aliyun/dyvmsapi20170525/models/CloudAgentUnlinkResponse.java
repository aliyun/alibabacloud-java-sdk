// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentUnlinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentUnlinkResponseBody body;

    public static CloudAgentUnlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentUnlinkResponse self = new CloudAgentUnlinkResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentUnlinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentUnlinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentUnlinkResponse setBody(CloudAgentUnlinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentUnlinkResponseBody getBody() {
        return this.body;
    }

}
