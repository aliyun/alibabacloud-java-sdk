// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetEstimateFeeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEstimateFeeInfoResponseBody body;

    public static GetEstimateFeeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEstimateFeeInfoResponse self = new GetEstimateFeeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEstimateFeeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEstimateFeeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEstimateFeeInfoResponse setBody(GetEstimateFeeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEstimateFeeInfoResponseBody getBody() {
        return this.body;
    }

}
