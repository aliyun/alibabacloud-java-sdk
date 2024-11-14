// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class ElectrobikeDirectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ElectrobikeDirectionResponseBody body;

    public static ElectrobikeDirectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectrobikeDirectionResponse self = new ElectrobikeDirectionResponse();
        return TeaModel.build(map, self);
    }

    public ElectrobikeDirectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElectrobikeDirectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ElectrobikeDirectionResponse setBody(ElectrobikeDirectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ElectrobikeDirectionResponseBody getBody() {
        return this.body;
    }

}
