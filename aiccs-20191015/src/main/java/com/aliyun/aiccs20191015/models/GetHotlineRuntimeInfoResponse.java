// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineRuntimeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineRuntimeInfoResponseBody body;

    public static GetHotlineRuntimeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineRuntimeInfoResponse self = new GetHotlineRuntimeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineRuntimeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineRuntimeInfoResponse setBody(GetHotlineRuntimeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineRuntimeInfoResponseBody getBody() {
        return this.body;
    }

}
