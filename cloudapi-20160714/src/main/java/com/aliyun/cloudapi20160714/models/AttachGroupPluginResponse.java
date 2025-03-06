// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachGroupPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachGroupPluginResponseBody body;

    public static AttachGroupPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachGroupPluginResponse self = new AttachGroupPluginResponse();
        return TeaModel.build(map, self);
    }

    public AttachGroupPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachGroupPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachGroupPluginResponse setBody(AttachGroupPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachGroupPluginResponseBody getBody() {
        return this.body;
    }

}
