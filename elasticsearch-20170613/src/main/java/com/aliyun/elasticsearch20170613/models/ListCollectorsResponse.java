// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListCollectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCollectorsResponseBody body;

    public static ListCollectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCollectorsResponse self = new ListCollectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListCollectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCollectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCollectorsResponse setBody(ListCollectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCollectorsResponseBody getBody() {
        return this.body;
    }

}
