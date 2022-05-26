// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ExistBindsByOuterIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExistBindsByOuterIdResponseBody body;

    public static ExistBindsByOuterIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistBindsByOuterIdResponse self = new ExistBindsByOuterIdResponse();
        return TeaModel.build(map, self);
    }

    public ExistBindsByOuterIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistBindsByOuterIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExistBindsByOuterIdResponse setBody(ExistBindsByOuterIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistBindsByOuterIdResponseBody getBody() {
        return this.body;
    }

}
