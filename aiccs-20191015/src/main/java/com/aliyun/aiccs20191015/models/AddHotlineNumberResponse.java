// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddHotlineNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddHotlineNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddHotlineNumberResponse setBody(AddHotlineNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHotlineNumberResponseBody getBody() {
        return this.body;
    }

}
