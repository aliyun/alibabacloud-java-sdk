// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class UpdateDistributorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDistributorResponseBody body;

    public static UpdateDistributorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributorResponse self = new UpdateDistributorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDistributorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDistributorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDistributorResponse setBody(UpdateDistributorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDistributorResponseBody getBody() {
        return this.body;
    }

}
