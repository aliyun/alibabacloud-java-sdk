// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetServiceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceConfigurationResponseBody body;

    public static GetServiceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigurationResponse self = new GetServiceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceConfigurationResponse setBody(GetServiceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceConfigurationResponseBody getBody() {
        return this.body;
    }

}
