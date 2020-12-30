// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserInputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserInputStatisticInfoResponseBody body;

    public static GetUserInputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserInputStatisticInfoResponse self = new GetUserInputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserInputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserInputStatisticInfoResponse setBody(GetUserInputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserInputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
