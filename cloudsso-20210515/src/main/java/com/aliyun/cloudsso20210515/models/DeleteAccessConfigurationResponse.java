// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessConfigurationResponseBody body;

    public static DeleteAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessConfigurationResponse self = new DeleteAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessConfigurationResponse setBody(DeleteAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
