// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class AttachIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachIndexVersionResponseBody body;

    public static AttachIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachIndexVersionResponse self = new AttachIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public AttachIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachIndexVersionResponse setBody(AttachIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachIndexVersionResponseBody getBody() {
        return this.body;
    }

}
