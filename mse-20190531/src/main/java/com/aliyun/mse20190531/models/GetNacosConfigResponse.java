// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNacosConfigResponseBody body;

    public static GetNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacosConfigResponse self = new GetNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacosConfigResponse setBody(GetNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacosConfigResponseBody getBody() {
        return this.body;
    }

}
