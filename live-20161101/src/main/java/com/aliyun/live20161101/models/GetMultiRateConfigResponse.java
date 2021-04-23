// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMultiRateConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMultiRateConfigResponseBody body;

    public static GetMultiRateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiRateConfigResponse self = new GetMultiRateConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiRateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiRateConfigResponse setBody(GetMultiRateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiRateConfigResponseBody getBody() {
        return this.body;
    }

}
