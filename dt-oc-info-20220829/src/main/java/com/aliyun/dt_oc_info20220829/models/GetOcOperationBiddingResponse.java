// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationBiddingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcOperationBiddingResponseBody body;

    public static GetOcOperationBiddingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationBiddingResponse self = new GetOcOperationBiddingResponse();
        return TeaModel.build(map, self);
    }

    public GetOcOperationBiddingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcOperationBiddingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcOperationBiddingResponse setBody(GetOcOperationBiddingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcOperationBiddingResponseBody getBody() {
        return this.body;
    }

}
