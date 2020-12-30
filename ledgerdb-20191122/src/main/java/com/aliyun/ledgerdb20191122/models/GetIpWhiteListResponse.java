// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetIpWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpWhiteListResponseBody body;

    public static GetIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpWhiteListResponse self = new GetIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public GetIpWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpWhiteListResponse setBody(GetIpWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpWhiteListResponseBody getBody() {
        return this.body;
    }

}
