// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceCategoriesResponseBody body;

    public static ListServiceCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCategoriesResponse self = new ListServiceCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceCategoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceCategoriesResponse setBody(ListServiceCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceCategoriesResponseBody getBody() {
        return this.body;
    }

}
