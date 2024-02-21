// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AddIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIpResponseBody body;

    public static AddIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpResponse self = new AddIpResponse();
        return TeaModel.build(map, self);
    }

    public AddIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIpResponse setBody(AddIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpResponseBody getBody() {
        return this.body;
    }

}
