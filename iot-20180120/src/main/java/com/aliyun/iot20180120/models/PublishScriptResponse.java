// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishScriptResponseBody body;

    public static PublishScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishScriptResponse self = new PublishScriptResponse();
        return TeaModel.build(map, self);
    }

    public PublishScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishScriptResponse setBody(PublishScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishScriptResponseBody getBody() {
        return this.body;
    }

}
