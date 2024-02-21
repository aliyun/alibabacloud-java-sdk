// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCdnSubTaskResponseBody body;

    public static CreateCdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnSubTaskResponse self = new CreateCdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdnSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCdnSubTaskResponse setBody(CreateCdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
