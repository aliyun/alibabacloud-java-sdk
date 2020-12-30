// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueInputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueueInputStatisticInfoResponseBody body;

    public static GetQueueInputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueInputStatisticInfoResponse self = new GetQueueInputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueInputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueInputStatisticInfoResponse setBody(GetQueueInputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueInputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
