// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetSchedulerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSchedulerInfoResponseBody body;

    public static GetSchedulerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSchedulerInfoResponse self = new GetSchedulerInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSchedulerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSchedulerInfoResponse setBody(GetSchedulerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSchedulerInfoResponseBody getBody() {
        return this.body;
    }

}
