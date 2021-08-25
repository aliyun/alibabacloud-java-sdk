// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIpStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpStatusResponseBody body;

    public static GetIpStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpStatusResponse self = new GetIpStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetIpStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpStatusResponse setBody(GetIpStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpStatusResponseBody getBody() {
        return this.body;
    }

}
