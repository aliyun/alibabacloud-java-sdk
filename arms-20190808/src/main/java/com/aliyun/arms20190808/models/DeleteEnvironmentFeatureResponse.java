// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnvironmentFeatureResponseBody body;

    public static DeleteEnvironmentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentFeatureResponse self = new DeleteEnvironmentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvironmentFeatureResponse setBody(DeleteEnvironmentFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentFeatureResponseBody getBody() {
        return this.body;
    }

}
