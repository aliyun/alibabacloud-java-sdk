// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJvmConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJvmConfigurationResponseBody body;

    public static GetJvmConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJvmConfigurationResponse self = new GetJvmConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetJvmConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJvmConfigurationResponse setBody(GetJvmConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJvmConfigurationResponseBody getBody() {
        return this.body;
    }

}
