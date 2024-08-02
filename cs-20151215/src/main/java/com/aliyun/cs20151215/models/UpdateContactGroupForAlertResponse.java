// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateContactGroupForAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContactGroupForAlertResponseBody body;

    public static UpdateContactGroupForAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupForAlertResponse self = new UpdateContactGroupForAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupForAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContactGroupForAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContactGroupForAlertResponse setBody(UpdateContactGroupForAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContactGroupForAlertResponseBody getBody() {
        return this.body;
    }

}
