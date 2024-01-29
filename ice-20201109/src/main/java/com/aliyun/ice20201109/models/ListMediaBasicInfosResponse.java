// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaBasicInfosResponseBody body;

    public static ListMediaBasicInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaBasicInfosResponse self = new ListMediaBasicInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaBasicInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaBasicInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaBasicInfosResponse setBody(ListMediaBasicInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaBasicInfosResponseBody getBody() {
        return this.body;
    }

}
