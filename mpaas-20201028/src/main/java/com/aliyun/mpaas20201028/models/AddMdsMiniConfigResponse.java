// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class AddMdsMiniConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMdsMiniConfigResponseBody body;

    public static AddMdsMiniConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMdsMiniConfigResponse self = new AddMdsMiniConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddMdsMiniConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMdsMiniConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMdsMiniConfigResponse setBody(AddMdsMiniConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMdsMiniConfigResponseBody getBody() {
        return this.body;
    }

}
