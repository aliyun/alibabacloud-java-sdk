// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkListPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AkListPageResponseBody body;

    public static AkListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        AkListPageResponse self = new AkListPageResponse();
        return TeaModel.build(map, self);
    }

    public AkListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AkListPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AkListPageResponse setBody(AkListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public AkListPageResponseBody getBody() {
        return this.body;
    }

}
