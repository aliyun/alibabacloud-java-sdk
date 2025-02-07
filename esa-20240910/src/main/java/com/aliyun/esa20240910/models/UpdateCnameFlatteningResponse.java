// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCnameFlatteningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCnameFlatteningResponseBody body;

    public static UpdateCnameFlatteningResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCnameFlatteningResponse self = new UpdateCnameFlatteningResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCnameFlatteningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCnameFlatteningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCnameFlatteningResponse setBody(UpdateCnameFlatteningResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCnameFlatteningResponseBody getBody() {
        return this.body;
    }

}
