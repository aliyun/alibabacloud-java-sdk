// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateShareScreenLayoutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateShareScreenLayoutResponseBody body;

    public static UpdateShareScreenLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareScreenLayoutResponse self = new UpdateShareScreenLayoutResponse();
        return TeaModel.build(map, self);
    }

    public UpdateShareScreenLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateShareScreenLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateShareScreenLayoutResponse setBody(UpdateShareScreenLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateShareScreenLayoutResponseBody getBody() {
        return this.body;
    }

}
