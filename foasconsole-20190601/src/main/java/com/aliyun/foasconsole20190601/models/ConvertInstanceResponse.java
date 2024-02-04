// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ConvertInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertInstanceResponseBody body;

    public static ConvertInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertInstanceResponse self = new ConvertInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ConvertInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertInstanceResponse setBody(ConvertInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertInstanceResponseBody getBody() {
        return this.body;
    }

}
