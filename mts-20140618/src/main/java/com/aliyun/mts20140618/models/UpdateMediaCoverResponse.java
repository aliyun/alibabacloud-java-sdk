// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCoverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaCoverResponseBody body;

    public static UpdateMediaCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCoverResponse self = new UpdateMediaCoverResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaCoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaCoverResponse setBody(UpdateMediaCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaCoverResponseBody getBody() {
        return this.body;
    }

}
