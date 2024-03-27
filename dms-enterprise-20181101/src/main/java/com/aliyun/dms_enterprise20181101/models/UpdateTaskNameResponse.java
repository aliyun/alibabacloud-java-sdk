// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskNameResponseBody body;

    public static UpdateTaskNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskNameResponse self = new UpdateTaskNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskNameResponse setBody(UpdateTaskNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskNameResponseBody getBody() {
        return this.body;
    }

}
