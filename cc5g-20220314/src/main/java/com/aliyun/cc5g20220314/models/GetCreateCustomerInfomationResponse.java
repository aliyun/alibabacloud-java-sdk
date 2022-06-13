// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInfomationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCreateCustomerInfomationResponseBody body;

    public static GetCreateCustomerInfomationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInfomationResponse self = new GetCreateCustomerInfomationResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInfomationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateCustomerInfomationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateCustomerInfomationResponse setBody(GetCreateCustomerInfomationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateCustomerInfomationResponseBody getBody() {
        return this.body;
    }

}
