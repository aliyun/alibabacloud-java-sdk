// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDistributionItemResponseBody body;

    public static ListDistributionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemResponse self = new ListDistributionItemResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributionItemResponse setBody(ListDistributionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributionItemResponseBody getBody() {
        return this.body;
    }

}
