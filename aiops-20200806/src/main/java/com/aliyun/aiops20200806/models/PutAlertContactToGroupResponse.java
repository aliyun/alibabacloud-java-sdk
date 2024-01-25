// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertContactToGroupResponseBody body;

    public static PutAlertContactToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactToGroupResponse self = new PutAlertContactToGroupResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertContactToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertContactToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertContactToGroupResponse setBody(PutAlertContactToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertContactToGroupResponseBody getBody() {
        return this.body;
    }

}
