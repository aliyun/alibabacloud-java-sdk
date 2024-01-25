// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddTagInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTagInfoResponseBody body;

    public static AddTagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagInfoResponse self = new AddTagInfoResponse();
        return TeaModel.build(map, self);
    }

    public AddTagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagInfoResponse setBody(AddTagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagInfoResponseBody getBody() {
        return this.body;
    }

}
