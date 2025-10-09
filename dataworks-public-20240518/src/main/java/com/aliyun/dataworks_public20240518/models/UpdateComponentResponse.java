// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComponentResponseBody body;

    public static UpdateComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentResponse self = new UpdateComponentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComponentResponse setBody(UpdateComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComponentResponseBody getBody() {
        return this.body;
    }

}
