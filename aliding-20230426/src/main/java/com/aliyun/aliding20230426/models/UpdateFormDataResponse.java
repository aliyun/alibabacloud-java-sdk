// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateFormDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFormDataResponseBody body;

    public static UpdateFormDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormDataResponse self = new UpdateFormDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFormDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFormDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFormDataResponse setBody(UpdateFormDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFormDataResponseBody getBody() {
        return this.body;
    }

}
