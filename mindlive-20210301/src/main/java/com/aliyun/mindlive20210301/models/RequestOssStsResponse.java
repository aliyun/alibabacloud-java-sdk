// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestOssStsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestOssStsResponseBody body;

    public static RequestOssStsResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestOssStsResponse self = new RequestOssStsResponse();
        return TeaModel.build(map, self);
    }

    public RequestOssStsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestOssStsResponse setBody(RequestOssStsResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestOssStsResponseBody getBody() {
        return this.body;
    }

}
