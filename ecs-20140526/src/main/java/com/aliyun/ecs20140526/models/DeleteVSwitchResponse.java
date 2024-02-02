// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVSwitchResponseBody body;

    public static DeleteVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchResponse self = new DeleteVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVSwitchResponse setBody(DeleteVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVSwitchResponseBody getBody() {
        return this.body;
    }

}
