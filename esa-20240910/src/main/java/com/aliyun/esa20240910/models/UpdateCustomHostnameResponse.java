// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomHostnameResponseBody body;

    public static UpdateCustomHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomHostnameResponse self = new UpdateCustomHostnameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomHostnameResponse setBody(UpdateCustomHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomHostnameResponseBody getBody() {
        return this.body;
    }

}
