// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListAcrImageRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAcrImageRepositoriesResponseBody body;

    public static ListAcrImageRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAcrImageRepositoriesResponse self = new ListAcrImageRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAcrImageRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAcrImageRepositoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAcrImageRepositoriesResponse setBody(ListAcrImageRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAcrImageRepositoriesResponseBody getBody() {
        return this.body;
    }

}
