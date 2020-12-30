// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetJobInputStatisticInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobInputStatisticInfoResponseBody body;

    public static GetJobInputStatisticInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInputStatisticInfoResponse self = new GetJobInputStatisticInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInputStatisticInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInputStatisticInfoResponse setBody(GetJobInputStatisticInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobInputStatisticInfoResponseBody getBody() {
        return this.body;
    }

}
