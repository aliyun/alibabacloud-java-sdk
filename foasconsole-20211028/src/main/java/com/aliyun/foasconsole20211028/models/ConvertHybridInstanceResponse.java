// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertHybridInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertHybridInstanceResponseBody body;

    public static ConvertHybridInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertHybridInstanceResponse self = new ConvertHybridInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConvertHybridInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertHybridInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertHybridInstanceResponse setBody(ConvertHybridInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertHybridInstanceResponseBody getBody() {
        return this.body;
    }

}
