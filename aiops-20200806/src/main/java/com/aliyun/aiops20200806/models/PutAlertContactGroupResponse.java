// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public PutAlertContactGroupResponse setBody(PutAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
