// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineWaitingNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineWaitingNumberResponseBody body;

    public static GetHotlineWaitingNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineWaitingNumberResponse self = new GetHotlineWaitingNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineWaitingNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineWaitingNumberResponse setBody(GetHotlineWaitingNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineWaitingNumberResponseBody getBody() {
        return this.body;
    }

}
