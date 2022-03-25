// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindByIsvTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyFindByIsvTypeResponseBody body;

    public static CompanyFindByIsvTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindByIsvTypeResponse self = new CompanyFindByIsvTypeResponse();
        return TeaModel.build(map, self);
    }

    public CompanyFindByIsvTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyFindByIsvTypeResponse setBody(CompanyFindByIsvTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyFindByIsvTypeResponseBody getBody() {
        return this.body;
    }

}
