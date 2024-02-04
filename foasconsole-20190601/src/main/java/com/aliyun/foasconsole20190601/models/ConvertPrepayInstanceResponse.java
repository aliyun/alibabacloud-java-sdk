// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertPrepayInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
