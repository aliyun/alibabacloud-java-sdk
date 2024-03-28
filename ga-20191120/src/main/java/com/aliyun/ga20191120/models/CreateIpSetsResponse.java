// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateIpSetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpSetsResponseBody body;

    public static CreateIpSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpSetsResponse self = new CreateIpSetsResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpSetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpSetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpSetsResponse setBody(CreateIpSetsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpSetsResponseBody getBody() {
        return this.body;
    }

}
