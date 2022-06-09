// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class StopGameLiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopGameLiveResponseBody body;

    public static StopGameLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        StopGameLiveResponse self = new StopGameLiveResponse();
        return TeaModel.build(map, self);
    }

    public StopGameLiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopGameLiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopGameLiveResponse setBody(StopGameLiveResponseBody body) {
        this.body = body;
        return this;
    }
    public StopGameLiveResponseBody getBody() {
        return this.body;
    }

}
