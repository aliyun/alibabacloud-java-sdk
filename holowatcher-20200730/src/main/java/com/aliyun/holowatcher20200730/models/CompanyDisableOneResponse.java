// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyDisableOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyDisableOneResponseBody body;

    public static CompanyDisableOneResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyDisableOneResponse self = new CompanyDisableOneResponse();
        return TeaModel.build(map, self);
    }

    public CompanyDisableOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyDisableOneResponse setBody(CompanyDisableOneResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyDisableOneResponseBody getBody() {
        return this.body;
    }

}
