// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKillInstanceSessionTaskResponseBody body;

    public static CreateKillInstanceSessionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskResponse self = new CreateKillInstanceSessionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKillInstanceSessionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKillInstanceSessionTaskResponse setBody(CreateKillInstanceSessionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKillInstanceSessionTaskResponseBody getBody() {
        return this.body;
    }

}
