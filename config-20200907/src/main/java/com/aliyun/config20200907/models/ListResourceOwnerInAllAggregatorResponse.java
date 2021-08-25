// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceOwnerInAllAggregatorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceOwnerInAllAggregatorResponseBody body;

    public static ListResourceOwnerInAllAggregatorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceOwnerInAllAggregatorResponse self = new ListResourceOwnerInAllAggregatorResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceOwnerInAllAggregatorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceOwnerInAllAggregatorResponse setBody(ListResourceOwnerInAllAggregatorResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceOwnerInAllAggregatorResponseBody getBody() {
        return this.body;
    }

}
