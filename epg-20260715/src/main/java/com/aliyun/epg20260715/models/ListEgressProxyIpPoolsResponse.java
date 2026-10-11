// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyIpPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEgressProxyIpPoolsResponseBody body;

    public static ListEgressProxyIpPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyIpPoolsResponse self = new ListEgressProxyIpPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyIpPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEgressProxyIpPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEgressProxyIpPoolsResponse setBody(ListEgressProxyIpPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEgressProxyIpPoolsResponseBody getBody() {
        return this.body;
    }

}
