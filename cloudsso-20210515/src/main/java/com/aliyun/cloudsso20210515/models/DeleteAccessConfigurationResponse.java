// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteAccessConfigurationResponse setBody(DeleteAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
