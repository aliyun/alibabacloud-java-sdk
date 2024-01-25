// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutAlertContactGroupResponseBody body;

    public static PutAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactGroupResponse self = new PutAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public PutAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutAlertContactGroupResponse setBody(PutAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
