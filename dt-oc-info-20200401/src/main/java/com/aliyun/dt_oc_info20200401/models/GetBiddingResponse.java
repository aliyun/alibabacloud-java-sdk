// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetBiddingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBiddingResponseBody body;

    public static GetBiddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingResponse self = new GetBiddingResponse();
        return TeaModel.build(map, self);
    }

    public GetBiddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBiddingResponse setBody(GetBiddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBiddingResponseBody getBody() {
        return this.body;
    }

}
