// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserOutputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserOutputStatisticInfoResponseBody body;

    public static GetUserOutputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserOutputStatisticInfoResponse self = new GetUserOutputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserOutputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserOutputStatisticInfoResponse setBody(GetUserOutputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserOutputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
