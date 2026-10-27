// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContactGroupResponseBody body;

    public static CreateContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContactGroupResponse self = new CreateContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContactGroupResponse setBody(CreateContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContactGroupResponseBody getBody() {
        return this.body;
    }

}
