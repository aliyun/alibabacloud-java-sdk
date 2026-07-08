// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class AddCloudAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCloudAccessResponseBody body;

    public static AddCloudAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCloudAccessResponse self = new AddCloudAccessResponse();
        return TeaModel.build(map, self);
    }

    public AddCloudAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCloudAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCloudAccessResponse setBody(AddCloudAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCloudAccessResponseBody getBody() {
        return this.body;
    }

}
