// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AkUpdateResponseBody body;

    public static AkUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        AkUpdateResponse self = new AkUpdateResponse();
        return TeaModel.build(map, self);
    }

    public AkUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AkUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AkUpdateResponse setBody(AkUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public AkUpdateResponseBody getBody() {
        return this.body;
    }

}
