// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostAutomateResponseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PostAutomateResponseConfigResponseBody body;

    public static PostAutomateResponseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PostAutomateResponseConfigResponse self = new PostAutomateResponseConfigResponse();
        return TeaModel.build(map, self);
    }

    public PostAutomateResponseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PostAutomateResponseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PostAutomateResponseConfigResponse setBody(PostAutomateResponseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PostAutomateResponseConfigResponseBody getBody() {
        return this.body;
    }

}
