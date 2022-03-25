// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyActivateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyActivateOneResponseBody body;

    public static CompanyActivateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyActivateOneResponse self = new CompanyActivateOneResponse();
        return TeaModel.build(map, self);
    }

    public CompanyActivateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyActivateOneResponse setBody(CompanyActivateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyActivateOneResponseBody getBody() {
        return this.body;
    }

}
