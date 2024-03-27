// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskConfigResponseBody body;

    public static UpdateTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskConfigResponse self = new UpdateTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskConfigResponse setBody(UpdateTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskConfigResponseBody getBody() {
        return this.body;
    }

}
