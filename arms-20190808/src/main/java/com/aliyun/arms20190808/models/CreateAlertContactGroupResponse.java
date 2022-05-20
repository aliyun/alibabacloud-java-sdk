// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlertContactGroupResponseBody body;

    public static CreateAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupResponse self = new CreateAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertContactGroupResponse setBody(CreateAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
