// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddServiceSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddServiceSourceResponseBody body;

    public static AddServiceSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServiceSourceResponse self = new AddServiceSourceResponse();
        return TeaModel.build(map, self);
    }

    public AddServiceSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServiceSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddServiceSourceResponse setBody(AddServiceSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServiceSourceResponseBody getBody() {
        return this.body;
    }

}
