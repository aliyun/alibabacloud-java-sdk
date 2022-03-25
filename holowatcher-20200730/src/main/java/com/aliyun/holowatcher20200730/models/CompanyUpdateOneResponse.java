// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyUpdateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyUpdateOneResponseBody body;

    public static CompanyUpdateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyUpdateOneResponse self = new CompanyUpdateOneResponse();
        return TeaModel.build(map, self);
    }

    public CompanyUpdateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyUpdateOneResponse setBody(CompanyUpdateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyUpdateOneResponseBody getBody() {
        return this.body;
    }

}
