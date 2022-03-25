// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ValidCompanyNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidCompanyNameResponseBody body;

    public static ValidCompanyNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidCompanyNameResponse self = new ValidCompanyNameResponse();
        return TeaModel.build(map, self);
    }

    public ValidCompanyNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidCompanyNameResponse setBody(ValidCompanyNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidCompanyNameResponseBody getBody() {
        return this.body;
    }

}
