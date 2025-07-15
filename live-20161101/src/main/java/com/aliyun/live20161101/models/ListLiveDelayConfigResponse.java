// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveDelayConfigResponseBody body;

    public static ListLiveDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveDelayConfigResponse self = new ListLiveDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveDelayConfigResponse setBody(ListLiveDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveDelayConfigResponseBody getBody() {
        return this.body;
    }

}
