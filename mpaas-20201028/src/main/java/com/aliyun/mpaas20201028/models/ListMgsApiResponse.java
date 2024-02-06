// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMgsApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMgsApiResponseBody body;

    public static ListMgsApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMgsApiResponse self = new ListMgsApiResponse();
        return TeaModel.build(map, self);
    }

    public ListMgsApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMgsApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMgsApiResponse setBody(ListMgsApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMgsApiResponseBody getBody() {
        return this.body;
    }

}
