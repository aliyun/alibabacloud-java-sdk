// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateC2paSignTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateC2paSignTaskResponseBody body;

    public static CreateC2paSignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateC2paSignTaskResponse self = new CreateC2paSignTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateC2paSignTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateC2paSignTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateC2paSignTaskResponse setBody(CreateC2paSignTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateC2paSignTaskResponseBody getBody() {
        return this.body;
    }

}
