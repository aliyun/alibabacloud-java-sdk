// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveMessageGroupUsersResponseBody body;

    public static ListLiveMessageGroupUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupUsersResponse self = new ListLiveMessageGroupUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveMessageGroupUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveMessageGroupUsersResponse setBody(ListLiveMessageGroupUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveMessageGroupUsersResponseBody getBody() {
        return this.body;
    }

}
