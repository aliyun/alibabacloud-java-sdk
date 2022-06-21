// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClassicNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClassicNetworkResponseBody body;

    public static CreateClassicNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClassicNetworkResponse self = new CreateClassicNetworkResponse();
        return TeaModel.build(map, self);
    }

    public CreateClassicNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClassicNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClassicNetworkResponse setBody(CreateClassicNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClassicNetworkResponseBody getBody() {
        return this.body;
    }

}
