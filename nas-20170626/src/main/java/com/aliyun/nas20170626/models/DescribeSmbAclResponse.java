// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSmbAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmbAclResponseBody body;

    public static DescribeSmbAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmbAclResponse self = new DescribeSmbAclResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmbAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmbAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmbAclResponse setBody(DescribeSmbAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmbAclResponseBody getBody() {
        return this.body;
    }

}
