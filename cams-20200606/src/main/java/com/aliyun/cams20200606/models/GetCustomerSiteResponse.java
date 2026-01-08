// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetCustomerSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomerSiteResponseBody body;

    public static GetCustomerSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerSiteResponse self = new GetCustomerSiteResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerSiteResponse setBody(GetCustomerSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerSiteResponseBody getBody() {
        return this.body;
    }

}
