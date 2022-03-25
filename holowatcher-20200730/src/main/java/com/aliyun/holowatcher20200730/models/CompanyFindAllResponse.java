// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyFindAllResponseBody body;

    public static CompanyFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindAllResponse self = new CompanyFindAllResponse();
        return TeaModel.build(map, self);
    }

    public CompanyFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyFindAllResponse setBody(CompanyFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyFindAllResponseBody getBody() {
        return this.body;
    }

}
