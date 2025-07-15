// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamPreloadTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveStreamPreloadTasksResponseBody body;

    public static SetLiveStreamPreloadTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamPreloadTasksResponse self = new SetLiveStreamPreloadTasksResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamPreloadTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveStreamPreloadTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveStreamPreloadTasksResponse setBody(SetLiveStreamPreloadTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveStreamPreloadTasksResponseBody getBody() {
        return this.body;
    }

}
