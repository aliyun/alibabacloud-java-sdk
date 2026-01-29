// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddCrossAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCrossAccountResponseBody body;

    public static AddCrossAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCrossAccountResponse self = new AddCrossAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddCrossAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCrossAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCrossAccountResponse setBody(AddCrossAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCrossAccountResponseBody getBody() {
        return this.body;
    }

}
