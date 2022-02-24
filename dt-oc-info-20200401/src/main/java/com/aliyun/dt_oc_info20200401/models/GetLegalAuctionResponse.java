// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetLegalAuctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLegalAuctionResponseBody body;

    public static GetLegalAuctionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLegalAuctionResponse self = new GetLegalAuctionResponse();
        return TeaModel.build(map, self);
    }

    public GetLegalAuctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLegalAuctionResponse setBody(GetLegalAuctionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLegalAuctionResponseBody getBody() {
        return this.body;
    }

}
