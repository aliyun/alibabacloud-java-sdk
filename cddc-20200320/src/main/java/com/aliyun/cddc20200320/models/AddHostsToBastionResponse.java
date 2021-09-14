// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class AddHostsToBastionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddHostsToBastionResponseBody body;

    public static AddHostsToBastionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToBastionResponse self = new AddHostsToBastionResponse();
        return TeaModel.build(map, self);
    }

    public AddHostsToBastionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHostsToBastionResponse setBody(AddHostsToBastionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHostsToBastionResponseBody getBody() {
        return this.body;
    }

}
