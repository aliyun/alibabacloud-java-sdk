// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteAlertGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlertGroupResponseBody body;

    public static DeleteAlertGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertGroupResponse self = new DeleteAlertGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertGroupResponse setBody(DeleteAlertGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertGroupResponseBody getBody() {
        return this.body;
    }

}
