// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestBackgroundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestBackgroundResponseBody body;

    public static RequestBackgroundResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestBackgroundResponse self = new RequestBackgroundResponse();
        return TeaModel.build(map, self);
    }

    public RequestBackgroundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestBackgroundResponse setBody(RequestBackgroundResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestBackgroundResponseBody getBody() {
        return this.body;
    }

}
