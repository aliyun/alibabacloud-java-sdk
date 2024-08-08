// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselineItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccountFactoryBaselineItemsResponseBody body;

    public static ListAccountFactoryBaselineItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselineItemsResponse self = new ListAccountFactoryBaselineItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselineItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccountFactoryBaselineItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccountFactoryBaselineItemsResponse setBody(ListAccountFactoryBaselineItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccountFactoryBaselineItemsResponseBody getBody() {
        return this.body;
    }

}
