// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicMediaBasicInfosResponseBody body;

    public static ListPublicMediaBasicInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicMediaBasicInfosResponse self = new ListPublicMediaBasicInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicMediaBasicInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicMediaBasicInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicMediaBasicInfosResponse setBody(ListPublicMediaBasicInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicMediaBasicInfosResponseBody getBody() {
        return this.body;
    }

}
