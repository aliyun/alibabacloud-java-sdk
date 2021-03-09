// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineCallActionResponseBody body;

    public static GetHotlineCallActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineCallActionResponse self = new GetHotlineCallActionResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineCallActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineCallActionResponse setBody(GetHotlineCallActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineCallActionResponseBody getBody() {
        return this.body;
    }

}
