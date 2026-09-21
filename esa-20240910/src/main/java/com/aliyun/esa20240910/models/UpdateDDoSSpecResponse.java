// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateDDoSSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDDoSSpecResponseBody body;

    public static UpdateDDoSSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDDoSSpecResponse self = new UpdateDDoSSpecResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDDoSSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDDoSSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDDoSSpecResponse setBody(UpdateDDoSSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDDoSSpecResponseBody getBody() {
        return this.body;
    }

}
