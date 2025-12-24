// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveTagResourcesResponseBody body;

    public static ListLiveTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTagResourcesResponse self = new ListLiveTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveTagResourcesResponse setBody(ListLiveTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveTagResourcesResponseBody getBody() {
        return this.body;
    }

}
