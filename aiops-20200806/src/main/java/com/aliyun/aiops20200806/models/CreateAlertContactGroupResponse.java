// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateAlertContactGroupResponse setBody(CreateAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
