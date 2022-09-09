// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateParameterSetResponseBody body;

    public static CreateParameterSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterSetResponse self = new CreateParameterSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateParameterSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateParameterSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateParameterSetResponse setBody(CreateParameterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateParameterSetResponseBody getBody() {
        return this.body;
    }

}
