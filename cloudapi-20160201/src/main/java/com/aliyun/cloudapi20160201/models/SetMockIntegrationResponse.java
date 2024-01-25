// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetMockIntegrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetMockIntegrationResponseBody body;

    public static SetMockIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMockIntegrationResponse self = new SetMockIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public SetMockIntegrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMockIntegrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetMockIntegrationResponse setBody(SetMockIntegrationResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMockIntegrationResponseBody getBody() {
        return this.body;
    }

}
