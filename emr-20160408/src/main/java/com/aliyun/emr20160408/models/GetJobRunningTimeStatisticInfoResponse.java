// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobRunningTimeStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobRunningTimeStatisticInfoResponseBody body;

    public static GetJobRunningTimeStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobRunningTimeStatisticInfoResponse self = new GetJobRunningTimeStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetJobRunningTimeStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobRunningTimeStatisticInfoResponse setBody(GetJobRunningTimeStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobRunningTimeStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
