// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCreateCustomerInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCreateCustomerInformationResponseBody body;

    public static GetCreateCustomerInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateCustomerInformationResponse self = new GetCreateCustomerInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateCustomerInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateCustomerInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateCustomerInformationResponse setBody(GetCreateCustomerInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateCustomerInformationResponseBody getBody() {
        return this.body;
    }

}
