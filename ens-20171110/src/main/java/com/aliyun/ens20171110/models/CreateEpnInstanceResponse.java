// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEpnInstanceResponseBody body;

    public static CreateEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceResponse self = new CreateEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEpnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEpnInstanceResponse setBody(CreateEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEpnInstanceResponseBody getBody() {
        return this.body;
    }

}
