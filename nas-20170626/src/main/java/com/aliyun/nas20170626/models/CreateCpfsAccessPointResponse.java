// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateCpfsAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCpfsAccessPointResponseBody body;

    public static CreateCpfsAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCpfsAccessPointResponse self = new CreateCpfsAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateCpfsAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCpfsAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCpfsAccessPointResponse setBody(CreateCpfsAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCpfsAccessPointResponseBody getBody() {
        return this.body;
    }

}
