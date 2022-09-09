// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteParameterSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteParameterSetResponseBody body;

    public static DeleteParameterSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterSetResponse self = new DeleteParameterSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParameterSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParameterSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParameterSetResponse setBody(DeleteParameterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParameterSetResponseBody getBody() {
        return this.body;
    }

}
