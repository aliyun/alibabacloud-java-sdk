// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class GetCustomerRebateTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerRebateTypeResponseBody body;

    public static GetCustomerRebateTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerRebateTypeResponse self = new GetCustomerRebateTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerRebateTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerRebateTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerRebateTypeResponse setBody(GetCustomerRebateTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerRebateTypeResponseBody getBody() {
        return this.body;
    }

}
