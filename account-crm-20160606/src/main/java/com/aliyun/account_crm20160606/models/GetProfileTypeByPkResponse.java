// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetProfileTypeByPkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProfileTypeByPkResponseBody body;

    public static GetProfileTypeByPkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProfileTypeByPkResponse self = new GetProfileTypeByPkResponse();
        return TeaModel.build(map, self);
    }

    public GetProfileTypeByPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProfileTypeByPkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProfileTypeByPkResponse setBody(GetProfileTypeByPkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProfileTypeByPkResponseBody getBody() {
        return this.body;
    }

}
