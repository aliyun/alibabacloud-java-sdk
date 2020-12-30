// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueOutputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueueOutputStatisticInfoResponseBody body;

    public static GetQueueOutputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueOutputStatisticInfoResponse self = new GetQueueOutputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueOutputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueOutputStatisticInfoResponse setBody(GetQueueOutputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueOutputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
