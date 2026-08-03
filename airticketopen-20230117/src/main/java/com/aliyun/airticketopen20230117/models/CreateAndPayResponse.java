// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CreateAndPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndPayResponseBody body;

    public static CreateAndPayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPayResponse self = new CreateAndPayResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndPayResponse setBody(CreateAndPayResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndPayResponseBody getBody() {
        return this.body;
    }

}
