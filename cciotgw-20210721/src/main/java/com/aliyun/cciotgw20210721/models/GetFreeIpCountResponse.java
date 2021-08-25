// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetFreeIpCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFreeIpCountResponseBody body;

    public static GetFreeIpCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFreeIpCountResponse self = new GetFreeIpCountResponse();
        return TeaModel.build(map, self);
    }

    public GetFreeIpCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFreeIpCountResponse setBody(GetFreeIpCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFreeIpCountResponseBody getBody() {
        return this.body;
    }

}
