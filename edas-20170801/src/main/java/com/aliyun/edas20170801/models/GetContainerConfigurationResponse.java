// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetContainerConfigurationResponseBody body;

    public static GetContainerConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContainerConfigurationResponse self = new GetContainerConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetContainerConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContainerConfigurationResponse setBody(GetContainerConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContainerConfigurationResponseBody getBody() {
        return this.body;
    }

}
