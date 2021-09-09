// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetRegionConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegionConfigurationResponseBody body;

    public static GetRegionConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegionConfigurationResponse self = new GetRegionConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public GetRegionConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegionConfigurationResponse setBody(GetRegionConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegionConfigurationResponseBody getBody() {
        return this.body;
    }

}
