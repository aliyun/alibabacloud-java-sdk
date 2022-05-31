// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class RemoveDistributionItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDistributionItemResponseBody body;

    public static RemoveDistributionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDistributionItemResponse self = new RemoveDistributionItemResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDistributionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDistributionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDistributionItemResponse setBody(RemoveDistributionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDistributionItemResponseBody getBody() {
        return this.body;
    }

}
