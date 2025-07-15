// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveMessageGroupsResponseBody body;

    public static ListLiveMessageGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupsResponse self = new ListLiveMessageGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveMessageGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveMessageGroupsResponse setBody(ListLiveMessageGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveMessageGroupsResponseBody getBody() {
        return this.body;
    }

}
