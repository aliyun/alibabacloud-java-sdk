// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionItemWithoutCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDistributionItemWithoutCacheResponseBody body;

    public static ListDistributionItemWithoutCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionItemWithoutCacheResponse self = new ListDistributionItemWithoutCacheResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributionItemWithoutCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDistributionItemWithoutCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDistributionItemWithoutCacheResponse setBody(ListDistributionItemWithoutCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDistributionItemWithoutCacheResponseBody getBody() {
        return this.body;
    }

}
