// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateParameterSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
