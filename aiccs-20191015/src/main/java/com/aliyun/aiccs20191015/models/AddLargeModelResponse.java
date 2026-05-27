// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddLargeModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLargeModelResponseBody body;

    public static AddLargeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLargeModelResponse self = new AddLargeModelResponse();
        return TeaModel.build(map, self);
    }

    public AddLargeModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLargeModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLargeModelResponse setBody(AddLargeModelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLargeModelResponseBody getBody() {
        return this.body;
    }

}
