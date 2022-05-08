// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachPluginResponseBody body;

    public static DetachPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachPluginResponse self = new DetachPluginResponse();
        return TeaModel.build(map, self);
    }

    public DetachPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachPluginResponse setBody(DetachPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachPluginResponseBody getBody() {
        return this.body;
    }

}
