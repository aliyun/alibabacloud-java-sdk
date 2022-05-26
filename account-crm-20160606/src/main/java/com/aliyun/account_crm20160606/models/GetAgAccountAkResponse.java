// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgAccountAkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgAccountAkResponseBody body;

    public static GetAgAccountAkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgAccountAkResponse self = new GetAgAccountAkResponse();
        return TeaModel.build(map, self);
    }

    public GetAgAccountAkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgAccountAkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgAccountAkResponse setBody(GetAgAccountAkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgAccountAkResponseBody getBody() {
        return this.body;
    }

}
