// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SubmitIsvCustomerTermsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIsvCustomerTermsResponseBody body;

    public static SubmitIsvCustomerTermsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIsvCustomerTermsResponse self = new SubmitIsvCustomerTermsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIsvCustomerTermsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIsvCustomerTermsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIsvCustomerTermsResponse setBody(SubmitIsvCustomerTermsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIsvCustomerTermsResponseBody getBody() {
        return this.body;
    }

}
