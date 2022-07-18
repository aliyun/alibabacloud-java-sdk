// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateStressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStressResponseBody body;

    public static UpdateStressResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStressResponse self = new UpdateStressResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStressResponse setBody(UpdateStressResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStressResponseBody getBody() {
        return this.body;
    }

}
