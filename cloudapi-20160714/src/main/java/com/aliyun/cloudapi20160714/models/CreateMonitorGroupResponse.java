// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorGroupResponseBody body;

    public static CreateMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupResponse self = new CreateMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorGroupResponse setBody(CreateMonitorGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorGroupResponseBody getBody() {
        return this.body;
    }

}
