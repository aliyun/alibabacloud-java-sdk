// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAliyunInstanceNewResponseBody body;

    public static CreateAliyunInstanceNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewResponse self = new CreateAliyunInstanceNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliyunInstanceNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAliyunInstanceNewResponse setBody(CreateAliyunInstanceNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAliyunInstanceNewResponseBody getBody() {
        return this.body;
    }

}
