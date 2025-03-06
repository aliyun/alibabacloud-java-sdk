// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachGroupPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachGroupPluginResponseBody body;

    public static DetachGroupPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachGroupPluginResponse self = new DetachGroupPluginResponse();
        return TeaModel.build(map, self);
    }

    public DetachGroupPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachGroupPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachGroupPluginResponse setBody(DetachGroupPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachGroupPluginResponseBody getBody() {
        return this.body;
    }

}
