// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddExtCodeSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddExtCodeSignResponseBody body;

    public static AddExtCodeSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AddExtCodeSignResponse self = new AddExtCodeSignResponse();
        return TeaModel.build(map, self);
    }

    public AddExtCodeSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddExtCodeSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddExtCodeSignResponse setBody(AddExtCodeSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AddExtCodeSignResponseBody getBody() {
        return this.body;
    }

}
