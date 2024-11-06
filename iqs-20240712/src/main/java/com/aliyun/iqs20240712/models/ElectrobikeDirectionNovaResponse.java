// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class ElectrobikeDirectionNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ElectrobikeDirectionNovaResponseBody body;

    public static ElectrobikeDirectionNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        ElectrobikeDirectionNovaResponse self = new ElectrobikeDirectionNovaResponse();
        return TeaModel.build(map, self);
    }

    public ElectrobikeDirectionNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ElectrobikeDirectionNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ElectrobikeDirectionNovaResponse setBody(ElectrobikeDirectionNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public ElectrobikeDirectionNovaResponseBody getBody() {
        return this.body;
    }

}
