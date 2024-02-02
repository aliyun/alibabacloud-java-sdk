// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartConferenceResponseBody body;

    public static StartConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartConferenceResponse self = new StartConferenceResponse();
        return TeaModel.build(map, self);
    }

    public StartConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartConferenceResponse setBody(StartConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartConferenceResponseBody getBody() {
        return this.body;
    }

}
