// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskOutputResponseBody body;

    public static UpdateTaskOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskOutputResponse self = new UpdateTaskOutputResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskOutputResponse setBody(UpdateTaskOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskOutputResponseBody getBody() {
        return this.body;
    }

}
