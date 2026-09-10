// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListSupportedPricingApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportedPricingApisResponseBody body;

    public static ListSupportedPricingApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedPricingApisResponse self = new ListSupportedPricingApisResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportedPricingApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportedPricingApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportedPricingApisResponse setBody(ListSupportedPricingApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportedPricingApisResponseBody getBody() {
        return this.body;
    }

}
