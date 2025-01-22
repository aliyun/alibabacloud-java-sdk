// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateProgramResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProgramResponseBody body;

    public static UpdateProgramResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProgramResponse self = new UpdateProgramResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProgramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProgramResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProgramResponse setBody(UpdateProgramResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProgramResponseBody getBody() {
        return this.body;
    }

}
