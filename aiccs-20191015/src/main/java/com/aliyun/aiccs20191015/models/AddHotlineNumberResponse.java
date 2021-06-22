// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddHotlineNumberResponseBody body;

    public static AddHotlineNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHotlineNumberResponse self = new AddHotlineNumberResponse();
        return TeaModel.build(map, self);
    }

    public AddHotlineNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHotlineNumberResponse setBody(AddHotlineNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHotlineNumberResponseBody getBody() {
        return this.body;
    }

}
