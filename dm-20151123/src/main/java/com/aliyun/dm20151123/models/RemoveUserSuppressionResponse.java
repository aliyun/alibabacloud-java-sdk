// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class RemoveUserSuppressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserSuppressionResponseBody body;

    public static RemoveUserSuppressionResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserSuppressionResponse self = new RemoveUserSuppressionResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserSuppressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserSuppressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserSuppressionResponse setBody(RemoveUserSuppressionResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserSuppressionResponseBody getBody() {
        return this.body;
    }

}
