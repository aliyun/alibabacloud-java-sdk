// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineMessageLogResponseBody body;

    public static GetHotlineMessageLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogResponse self = new GetHotlineMessageLogResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineMessageLogResponse setBody(GetHotlineMessageLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineMessageLogResponseBody getBody() {
        return this.body;
    }

}
