// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomQAResponseBody body;

    public static AddCustomQAResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAResponse self = new AddCustomQAResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomQAResponse setBody(AddCustomQAResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomQAResponseBody getBody() {
        return this.body;
    }

}
