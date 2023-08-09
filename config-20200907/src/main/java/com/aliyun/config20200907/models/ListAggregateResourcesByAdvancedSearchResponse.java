// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourcesByAdvancedSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAggregateResourcesByAdvancedSearchResponseBody body;

    public static ListAggregateResourcesByAdvancedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourcesByAdvancedSearchResponse self = new ListAggregateResourcesByAdvancedSearchResponse();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourcesByAdvancedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggregateResourcesByAdvancedSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggregateResourcesByAdvancedSearchResponse setBody(ListAggregateResourcesByAdvancedSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggregateResourcesByAdvancedSearchResponseBody getBody() {
        return this.body;
    }

}
