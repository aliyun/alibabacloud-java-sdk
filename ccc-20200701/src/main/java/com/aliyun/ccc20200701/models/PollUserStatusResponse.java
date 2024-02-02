// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PollUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PollUserStatusResponseBody body;

    public static PollUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PollUserStatusResponse self = new PollUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public PollUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PollUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PollUserStatusResponse setBody(PollUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PollUserStatusResponseBody getBody() {
        return this.body;
    }

}
