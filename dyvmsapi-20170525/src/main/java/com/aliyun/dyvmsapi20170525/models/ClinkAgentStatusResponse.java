// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkAgentStatusResponseBody body;

    public static ClinkAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkAgentStatusResponse self = new ClinkAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public ClinkAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkAgentStatusResponse setBody(ClinkAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkAgentStatusResponseBody getBody() {
        return this.body;
    }

}
