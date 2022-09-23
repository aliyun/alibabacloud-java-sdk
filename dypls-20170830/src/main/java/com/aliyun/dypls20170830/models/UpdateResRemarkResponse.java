// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UpdateResRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResRemarkResponseBody body;

    public static UpdateResRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResRemarkResponse self = new UpdateResRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResRemarkResponse setBody(UpdateResRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResRemarkResponseBody getBody() {
        return this.body;
    }

}
