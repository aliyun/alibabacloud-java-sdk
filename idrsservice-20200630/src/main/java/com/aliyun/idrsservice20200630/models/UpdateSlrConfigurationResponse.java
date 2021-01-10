// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateSlrConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSlrConfigurationResponseBody body;

    public static UpdateSlrConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlrConfigurationResponse self = new UpdateSlrConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlrConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlrConfigurationResponse setBody(UpdateSlrConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlrConfigurationResponseBody getBody() {
        return this.body;
    }

}
