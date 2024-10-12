// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRunResponseBody body;

    public static UpdateRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRunResponse self = new UpdateRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRunResponse setBody(UpdateRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRunResponseBody getBody() {
        return this.body;
    }

}
