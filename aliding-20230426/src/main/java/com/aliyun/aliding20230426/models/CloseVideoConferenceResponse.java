// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CloseVideoConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseVideoConferenceResponseBody body;

    public static CloseVideoConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseVideoConferenceResponse self = new CloseVideoConferenceResponse();
        return TeaModel.build(map, self);
    }

    public CloseVideoConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseVideoConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseVideoConferenceResponse setBody(CloseVideoConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseVideoConferenceResponseBody getBody() {
        return this.body;
    }

}
