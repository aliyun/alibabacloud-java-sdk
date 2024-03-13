// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceResponseBody body;

    public static AddFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceResponse self = new AddFaceResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceResponse setBody(AddFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceResponseBody getBody() {
        return this.body;
    }

}
