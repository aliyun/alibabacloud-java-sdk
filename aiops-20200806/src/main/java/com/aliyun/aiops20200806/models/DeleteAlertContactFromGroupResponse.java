// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertContactFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertContactFromGroupResponseBody body;

    public static DeleteAlertContactFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactFromGroupResponse self = new DeleteAlertContactFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertContactFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertContactFromGroupResponse setBody(DeleteAlertContactFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertContactFromGroupResponseBody getBody() {
        return this.body;
    }

}
