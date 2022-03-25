// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyListByConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompanyListByConditionResponseBody body;

    public static CompanyListByConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        CompanyListByConditionResponse self = new CompanyListByConditionResponse();
        return TeaModel.build(map, self);
    }

    public CompanyListByConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompanyListByConditionResponse setBody(CompanyListByConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public CompanyListByConditionResponseBody getBody() {
        return this.body;
    }

}
