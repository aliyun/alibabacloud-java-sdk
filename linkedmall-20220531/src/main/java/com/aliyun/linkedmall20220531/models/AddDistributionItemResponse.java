// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class AddDistributionItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddDistributionItemResponseBody body;

    public static AddDistributionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDistributionItemResponse self = new AddDistributionItemResponse();
        return TeaModel.build(map, self);
    }

    public AddDistributionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDistributionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDistributionItemResponse setBody(AddDistributionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDistributionItemResponseBody getBody() {
        return this.body;
    }

}
