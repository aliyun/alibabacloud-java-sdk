// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertPrepayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertPrepayInstanceResponseBody body;

    public static ConvertPrepayInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertPrepayInstanceResponse self = new ConvertPrepayInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConvertPrepayInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertPrepayInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertPrepayInstanceResponse setBody(ConvertPrepayInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertPrepayInstanceResponseBody getBody() {
        return this.body;
    }

}
