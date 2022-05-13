// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteVGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVGroupResponseBody body;

    public static DeleteVGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVGroupResponse self = new DeleteVGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVGroupResponse setBody(DeleteVGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVGroupResponseBody getBody() {
        return this.body;
    }

}
