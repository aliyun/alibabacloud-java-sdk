// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskContentResponseBody body;

    public static UpdateTaskContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskContentResponse self = new UpdateTaskContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskContentResponse setBody(UpdateTaskContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskContentResponseBody getBody() {
        return this.body;
    }

}
