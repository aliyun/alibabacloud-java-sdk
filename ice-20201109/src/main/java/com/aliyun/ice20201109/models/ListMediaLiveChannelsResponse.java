// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaLiveChannelsResponseBody body;

    public static ListMediaLiveChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveChannelsResponse self = new ListMediaLiveChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaLiveChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaLiveChannelsResponse setBody(ListMediaLiveChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaLiveChannelsResponseBody getBody() {
        return this.body;
    }

}
