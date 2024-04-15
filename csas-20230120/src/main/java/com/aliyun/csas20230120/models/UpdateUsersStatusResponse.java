// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUsersStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUsersStatusResponseBody body;

    public static UpdateUsersStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersStatusResponse self = new UpdateUsersStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUsersStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUsersStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUsersStatusResponse setBody(UpdateUsersStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUsersStatusResponseBody getBody() {
        return this.body;
    }

}
