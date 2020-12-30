// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueSubmissionStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQueueSubmissionStatisticInfoResponseBody body;

    public static GetQueueSubmissionStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueSubmissionStatisticInfoResponse self = new GetQueueSubmissionStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueSubmissionStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueSubmissionStatisticInfoResponse setBody(GetQueueSubmissionStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueSubmissionStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
