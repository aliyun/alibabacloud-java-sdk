// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RecoverAICInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverAICInstanceResponseBody body;

    public static RecoverAICInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverAICInstanceResponse self = new RecoverAICInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RecoverAICInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverAICInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverAICInstanceResponse setBody(RecoverAICInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverAICInstanceResponseBody getBody() {
        return this.body;
    }

}
