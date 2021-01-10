// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSlrConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlrConfigurationResponseBody body;

    public static GetSlrConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlrConfigurationResponse self = new GetSlrConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetSlrConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlrConfigurationResponse setBody(GetSlrConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlrConfigurationResponseBody getBody() {
        return this.body;
    }

}
