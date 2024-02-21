// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallAckOperatorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAckOperatorResponseBody body;

    public static InstallAckOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAckOperatorResponse self = new InstallAckOperatorResponse();
        return TeaModel.build(map, self);
    }

    public InstallAckOperatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAckOperatorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAckOperatorResponse setBody(InstallAckOperatorResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAckOperatorResponseBody getBody() {
        return this.body;
    }

}
