// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SwitchToConferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchToConferenceResponseBody body;

    public static SwitchToConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchToConferenceResponse self = new SwitchToConferenceResponse();
        return TeaModel.build(map, self);
    }

    public SwitchToConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchToConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchToConferenceResponse setBody(SwitchToConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchToConferenceResponseBody getBody() {
        return this.body;
    }

}
