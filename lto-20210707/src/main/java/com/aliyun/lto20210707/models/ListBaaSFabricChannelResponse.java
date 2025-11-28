// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaaSFabricChannelResponseBody body;

    public static ListBaaSFabricChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricChannelResponse self = new ListBaaSFabricChannelResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSFabricChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaaSFabricChannelResponse setBody(ListBaaSFabricChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSFabricChannelResponseBody getBody() {
        return this.body;
    }

}
