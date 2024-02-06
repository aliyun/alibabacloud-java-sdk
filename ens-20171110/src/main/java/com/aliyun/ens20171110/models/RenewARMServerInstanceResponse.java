// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RenewARMServerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewARMServerInstanceResponseBody body;

    public static RenewARMServerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewARMServerInstanceResponse self = new RenewARMServerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewARMServerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewARMServerInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewARMServerInstanceResponse setBody(RenewARMServerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewARMServerInstanceResponseBody getBody() {
        return this.body;
    }

}
