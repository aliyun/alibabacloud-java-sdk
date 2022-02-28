// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RequestBdTrialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestBdTrialResponseBody body;

    public static RequestBdTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestBdTrialResponse self = new RequestBdTrialResponse();
        return TeaModel.build(map, self);
    }

    public RequestBdTrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestBdTrialResponse setBody(RequestBdTrialResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestBdTrialResponseBody getBody() {
        return this.body;
    }

}
