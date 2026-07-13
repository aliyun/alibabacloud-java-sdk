// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiAgentRegisterInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAtiAgentRegisterInfosResponseBody body;

    public static ListAtiAgentRegisterInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAtiAgentRegisterInfosResponse self = new ListAtiAgentRegisterInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListAtiAgentRegisterInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAtiAgentRegisterInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAtiAgentRegisterInfosResponse setBody(ListAtiAgentRegisterInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAtiAgentRegisterInfosResponseBody getBody() {
        return this.body;
    }

}
