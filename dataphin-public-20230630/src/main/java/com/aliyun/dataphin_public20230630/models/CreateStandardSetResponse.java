// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStandardSetResponseBody body;

    public static CreateStandardSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardSetResponse self = new CreateStandardSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStandardSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStandardSetResponse setBody(CreateStandardSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStandardSetResponseBody getBody() {
        return this.body;
    }

}
