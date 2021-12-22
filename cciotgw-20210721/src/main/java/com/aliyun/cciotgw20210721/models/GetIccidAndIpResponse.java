// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIccidAndIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIccidAndIpResponseBody body;

    public static GetIccidAndIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIccidAndIpResponse self = new GetIccidAndIpResponse();
        return TeaModel.build(map, self);
    }

    public GetIccidAndIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIccidAndIpResponse setBody(GetIccidAndIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIccidAndIpResponseBody getBody() {
        return this.body;
    }

}
