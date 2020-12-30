// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobOutputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobOutputStatisticInfoResponseBody body;

    public static GetJobOutputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobOutputStatisticInfoResponse self = new GetJobOutputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetJobOutputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobOutputStatisticInfoResponse setBody(GetJobOutputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobOutputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
