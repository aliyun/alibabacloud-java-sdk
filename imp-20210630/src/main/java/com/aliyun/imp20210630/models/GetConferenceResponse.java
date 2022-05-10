// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConferenceResponseBody body;

    public static GetConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConferenceResponse self = new GetConferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConferenceResponse setBody(GetConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConferenceResponseBody getBody() {
        return this.body;
    }

}
