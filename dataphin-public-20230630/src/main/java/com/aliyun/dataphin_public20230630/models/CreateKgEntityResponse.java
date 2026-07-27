// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKgEntityResponseBody body;

    public static CreateKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKgEntityResponse self = new CreateKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKgEntityResponse setBody(CreateKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKgEntityResponseBody getBody() {
        return this.body;
    }

}
