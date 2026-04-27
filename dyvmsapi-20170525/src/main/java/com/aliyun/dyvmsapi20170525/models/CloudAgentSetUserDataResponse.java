// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentSetUserDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloudAgentSetUserDataResponseBody body;

    public static CloudAgentSetUserDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentSetUserDataResponse self = new CloudAgentSetUserDataResponse();
        return TeaModel.build(map, self);
    }

    public CloudAgentSetUserDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudAgentSetUserDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudAgentSetUserDataResponse setBody(CloudAgentSetUserDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudAgentSetUserDataResponseBody getBody() {
        return this.body;
    }

}
