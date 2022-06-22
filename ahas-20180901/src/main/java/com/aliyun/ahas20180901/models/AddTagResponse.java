// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagResponseBody body;

    public static AddTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagResponse self = new AddTagResponse();
        return TeaModel.build(map, self);
    }

    public AddTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagResponse setBody(AddTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagResponseBody getBody() {
        return this.body;
    }

}
