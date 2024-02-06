// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsSaleControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnsSaleControlResponseBody body;

    public static CreateEnsSaleControlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsSaleControlResponse self = new CreateEnsSaleControlResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnsSaleControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnsSaleControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnsSaleControlResponse setBody(CreateEnsSaleControlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnsSaleControlResponseBody getBody() {
        return this.body;
    }

}
