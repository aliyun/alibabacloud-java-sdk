// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicIpSetResponseBody body;

    public static CreateBasicIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetResponse self = new CreateBasicIpSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicIpSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicIpSetResponse setBody(CreateBasicIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicIpSetResponseBody getBody() {
        return this.body;
    }

}
