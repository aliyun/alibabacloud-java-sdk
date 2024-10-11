// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListMixCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMixCategoriesResponseBody body;

    public static ListMixCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMixCategoriesResponse self = new ListMixCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListMixCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMixCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMixCategoriesResponse setBody(ListMixCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMixCategoriesResponseBody getBody() {
        return this.body;
    }

}
