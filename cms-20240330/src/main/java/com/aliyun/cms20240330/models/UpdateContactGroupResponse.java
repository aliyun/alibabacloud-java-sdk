// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateContactGroupResponseBody body;

    public static UpdateContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupResponse self = new UpdateContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateContactGroupResponse setBody(UpdateContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateContactGroupResponseBody getBody() {
        return this.body;
    }

}
