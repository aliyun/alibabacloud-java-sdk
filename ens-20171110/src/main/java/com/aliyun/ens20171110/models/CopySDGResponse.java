// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySDGResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CopySDGResponseBody body;

    public static CopySDGResponse build(java.util.Map<String, ?> map) throws Exception {
        CopySDGResponse self = new CopySDGResponse();
        return TeaModel.build(map, self);
    }

    public CopySDGResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopySDGResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopySDGResponse setBody(CopySDGResponseBody body) {
        this.body = body;
        return this;
    }
    public CopySDGResponseBody getBody() {
        return this.body;
    }

}
