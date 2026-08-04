// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ChangeAgAccountNationalityCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeAgAccountNationalityCodeResponseBody body;

    public static ChangeAgAccountNationalityCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAgAccountNationalityCodeResponse self = new ChangeAgAccountNationalityCodeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAgAccountNationalityCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAgAccountNationalityCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAgAccountNationalityCodeResponse setBody(ChangeAgAccountNationalityCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAgAccountNationalityCodeResponseBody getBody() {
        return this.body;
    }

}
