// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EndConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndConferenceResponseBody body;

    public static EndConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        EndConferenceResponse self = new EndConferenceResponse();
        return TeaModel.build(map, self);
    }

    public EndConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndConferenceResponse setBody(EndConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public EndConferenceResponseBody getBody() {
        return this.body;
    }

}
