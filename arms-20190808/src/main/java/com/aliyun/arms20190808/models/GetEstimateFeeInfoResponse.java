// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetEstimateFeeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public GetEstimateFeeInfoResponse setBody(GetEstimateFeeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEstimateFeeInfoResponseBody getBody() {
        return this.body;
    }

}
