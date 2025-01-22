// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChannelsResponseBody body;

    public static ListChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChannelsResponse self = new ListChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChannelsResponse setBody(ListChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChannelsResponseBody getBody() {
        return this.body;
    }

}
