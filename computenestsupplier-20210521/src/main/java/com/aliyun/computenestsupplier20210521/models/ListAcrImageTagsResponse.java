// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAcrImageTagsResponseBody body;

    public static ListAcrImageTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageTagsResponse self = new ListAcrImageTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListAcrImageTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAcrImageTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAcrImageTagsResponse setBody(ListAcrImageTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAcrImageTagsResponseBody getBody() {
        return this.body;
    }

}
