// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFileResponseBody body;

    public static AddFileResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFileResponse self = new AddFileResponse();
        return TeaModel.build(map, self);
    }

    public AddFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFileResponse setBody(AddFileResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFileResponseBody getBody() {
        return this.body;
    }

}
