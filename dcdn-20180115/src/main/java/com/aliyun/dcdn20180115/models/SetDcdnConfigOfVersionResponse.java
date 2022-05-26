// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnConfigOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDcdnConfigOfVersionResponseBody body;

    public static SetDcdnConfigOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnConfigOfVersionResponse self = new SetDcdnConfigOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetDcdnConfigOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDcdnConfigOfVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDcdnConfigOfVersionResponse setBody(SetDcdnConfigOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDcdnConfigOfVersionResponseBody getBody() {
        return this.body;
    }

}
