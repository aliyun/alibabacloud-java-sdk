// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosHistoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNacosHistoryConfigResponseBody body;

    public static GetNacosHistoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacosHistoryConfigResponse self = new GetNacosHistoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNacosHistoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacosHistoryConfigResponse setBody(GetNacosHistoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacosHistoryConfigResponseBody getBody() {
        return this.body;
    }

}
