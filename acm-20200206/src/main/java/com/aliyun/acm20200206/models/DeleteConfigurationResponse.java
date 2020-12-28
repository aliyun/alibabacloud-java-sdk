// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeleteConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConfigurationResponseBody body;

    public static DeleteConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationResponse self = new DeleteConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigurationResponse setBody(DeleteConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigurationResponseBody getBody() {
        return this.body;
    }

}
