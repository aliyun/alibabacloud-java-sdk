// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddImageLabelsResponseBody body;

    public static AddImageLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageLabelsResponse self = new AddImageLabelsResponse();
        return TeaModel.build(map, self);
    }

    public AddImageLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageLabelsResponse setBody(AddImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageLabelsResponseBody getBody() {
        return this.body;
    }

}
