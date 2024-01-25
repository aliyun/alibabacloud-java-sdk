// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachPluginResponseBody body;

    public static AttachPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachPluginResponse self = new AttachPluginResponse();
        return TeaModel.build(map, self);
    }

    public AttachPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachPluginResponse setBody(AttachPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachPluginResponseBody getBody() {
        return this.body;
    }

}
